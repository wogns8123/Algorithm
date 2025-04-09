import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static boolean[] visited;
    static int[] numArr;
    static void dfs(int N, int M, int depth){
        if (depth == M){
            for(int k : numArr){
                System.out.print(k + " ");
            }
            System.out.println();
            return;
        }
        for(int i = 0; i<N; i++){
            if (!visited[i]){
                visited[i] = true;
                numArr[depth] = i+1;
                dfs(N,M,depth+1);
                visited[i] = false;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        numArr = new int[M];
        visited = new boolean[N];
        int depth = 0;
        dfs(N,M,0);

    }
}
