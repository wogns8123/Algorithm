import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num+1];
        int[] dp = new int[num+1];
        for(int i = 1; i<= num ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        if(num == 1) {
            System.out.println(arr[1]);
            return;
        }
        dp[1] = arr[1];
        dp[2] = arr[1]+arr[2];

        for(int i = 3; i<=num ; i++){
            dp[i] = Math.max(Math.max(dp[i-1], dp[i-2] + arr[i]), dp[i-3] + arr[i] + arr[i-1]);
        }

        System.out.println(dp[num]);
    }
}
