import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int start = scan.nextInt();
        int end = scan.nextInt();

        boolean[] isPrime = new boolean[end+1];
        for(int i = 2; i<=end;i++){
            isPrime[i] = true;
        }
        for(int i = 2; i<= Math.sqrt(end); i++){
            if(isPrime[i]){
                for(int j = i*i ; j<=end;j+=i){
                    isPrime[j] = false;
                }
            }
        }
        int sum = 0;
        int min = Integer.MAX_VALUE;
        for(int i = start; i<= end; i++) {
            if (isPrime[i]) {
                sum += i;
                if (i < min) {
                    min = i;
                }
            }
        }
        if (sum == 0){
            System.out.println(-1);
        }else{
            System.out.println(sum);
            System.out.println(min);
        }

    }
}
