import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[][] arr = new int[num][];
        int[][] dp = new int[num][];
        for(int i = 0; i< num ; i++){
            arr[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            dp[i] = new int[i+1];
        }
        dp[0][0] = arr[0][0];

        for(int i = 1; i<num; i++){
            // 처음
            dp[i][0] = dp[i-1][0] + arr[i][0];
            //중간
            for(int j = 1; j<i; j++){
                dp[i][j] = Math.max(dp[i-1][j-1], dp[i-1][j]) + arr[i][j];
            }
            //마지막
            dp[i][i] = dp[i-1][i-1] + arr[i][i];
        }
        int max = Integer.MIN_VALUE;
        for(int k : dp[num-1]){
            max = Math.max(max, k);
        }
        System.out.println(max);
    }
}
