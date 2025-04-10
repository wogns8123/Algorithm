import org.w3c.dom.xpath.XPathResult;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[][] arr = new int[num][];
        int[] dp = new int[num];
        Arrays.fill(dp,1);
        for(int i = 0; i<num;i++){
            arr[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        Arrays.sort(arr, Comparator.comparingInt(a -> a[0]));

        for(int i = 0;i<num ; i++) {
            for (int j = 0; j < i; j++) {
                if (arr[j][1] < arr[i][1]) {
                    dp[i] = Math.max(dp[j] + 1,dp[i]);
                }
            }
        }
        int max = 0;
        for(int k : dp){
            max = max<k ? k:max;
        }

        System.out.println(num - max);
    }
}
