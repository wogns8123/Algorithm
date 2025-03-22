import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int M = scan.nextInt();
        int N = scan.nextInt();
        int[] arr = new int[M];
        for (int i =0; i<N; i++){
            int start = scan.nextInt();
            int end = scan.nextInt();
            int number = scan.nextInt();
            for(int j = start-1; j<end; j++){
                arr[j] = number;
            }

//            int[] check = Arrays.copyOfRange(arr, start-1, end);
//            Arrays.fill(check, number);
        }
        for(int k:arr){
            System.out.print(k+" ");
        }
//        System.out.println(Arrays.toString(arr));

    }
}
