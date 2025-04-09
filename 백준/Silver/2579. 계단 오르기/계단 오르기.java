import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];
        int[] dp = new int[num];
        for(int i = 0; i < num; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        dp[0] = arr[0];
        if(num >= 2){
            dp[1] = arr[0] + arr[1];
        }
        if(num>=3){
            dp[2] = Math.max(arr[2] + arr[0] , arr[1] + arr[2]);
        }
        for(int i =3; i<num;i++){
            dp[i] = Math.max(dp[i-2], dp[i-3]+arr[i-1]) + arr[i];
        }

        System.out.println(dp[num-1]);
    }
}
