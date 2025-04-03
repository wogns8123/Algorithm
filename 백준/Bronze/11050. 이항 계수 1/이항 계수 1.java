import java.util.Scanner;

public class Main {
    public static int factorial(int n){
        int res = 1;
        for(int i = n; i>0; i--){
            res *= i;
        }
        return res;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int K = scan.nextInt();

        System.out.println((factorial(N) / (factorial(N-K) * factorial(K))));

    }
}
