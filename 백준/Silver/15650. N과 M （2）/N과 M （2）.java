import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static int[] arr;
    public static void dfs(int N, int M, int depth, int num){
        if(depth == M){
            for (int k : arr){
                System.out.print(k + " ");
            }
            System.out.println();
            return;
        }

        for (int i = num; i<=N; i++){
            arr[depth] = i;
            dfs(N,M,depth+1, i+1);
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        arr = new int[M];
        int depth = 0;
        dfs(N,M,0, 1);
    }
}
