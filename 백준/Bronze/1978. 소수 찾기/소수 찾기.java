import java.util.Arrays;

import java.util.Scanner;

public class Main {
    static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        scan.nextInt();
        scan.nextLine();
        Main obj = new Main();

        int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int count = 0;
        for(int k : arr){
            if (obj.isPrime(k)){
                count++;
            }
        }
        System.out.println(count);

    }
}
