import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    static int[] arr;
    static int n;

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        int[] dp = new int[n];
        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        dp[0] = arr[0];
        int max = dp[0];
        for(int i = 1; i<n; i++){
            dp[i] = Math.max(arr[i], dp[i-1] + arr[i]);
            max = Math.max(dp[i], max);
        }
        System.out.println(max);

    }
}
