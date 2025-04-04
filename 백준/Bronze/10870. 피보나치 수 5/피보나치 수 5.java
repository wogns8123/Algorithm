import java.util.Scanner;

public class Main {
    public static int pibo(int n){
        if (n == 1 || n == 2) return 1;
        else return pibo(n-1) + pibo(n-2);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int[] dp = new int[num+2];
        dp[0] = 0;
        dp[1] = 1;
        for(int i = 2; i<=num; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }
        System.out.println(dp[num]);

    }
}
