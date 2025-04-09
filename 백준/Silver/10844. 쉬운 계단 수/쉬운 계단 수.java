import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[][] dp = new int[num+1][10];
        dp[1][0] = 0;
        for(int i = 1; i<= 9;i++){
            dp[1][i] = 1;
        }
        for(int i = 2; i<=num;i++){
            for(int j = 0; j<=9; j++){
                if (j > 0) dp[i][j] += dp[i-1][j-1];
                if (j < 9) dp[i][j] += dp[i-1][j+1];
                dp[i][j] %= 1000000000;
            }
        }
        int total = 0;
        for(int k : dp[num]){
            total= (total + k) % 1000000000;
        }
        System.out.println(total);
    }
}
