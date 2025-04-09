import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int[] arr;
    static int count = 0;
    static int N;
    public static void dfs(int depth){
        if(depth == N){
            count ++;
            return;
        }
        for(int i = 0; i<N; i++){
            arr[depth] = i;
            if(isPossible(depth)){
                dfs(depth+1);
            }
        }
    }

    public static boolean isPossible(int depth){
        for(int i = 0; i < depth; i++){
            if (arr[i] == arr[depth]) return false;
            if (Math.abs(arr[i] - arr[depth]) == Math.abs(depth-i)) return false;
        }
        return true;

    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N];
        dfs(0);
        System.out.println(count);
    }
}
