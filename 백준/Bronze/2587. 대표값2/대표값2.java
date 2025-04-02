import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[5];
        int avg = 0;
        for(int i = 0 ; i < 5 ; i++){
            int a = scan.nextInt();
            arr[i] = a;
            avg += a;
        }
        Arrays.sort(arr);
        System.out.println(avg/5);
        System.out.println(arr[2]);
    }
}
