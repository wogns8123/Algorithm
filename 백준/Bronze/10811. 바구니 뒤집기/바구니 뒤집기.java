import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();
        int M = scan.nextInt();
        List<Integer> reversedArray = new ArrayList<>();


        int[] arr = new int[N];
        for(int i = 0; i<N; i++){
            arr[i] = i+1;
        }

        for(int i = 0; i<M; i++){
            int start = scan.nextInt();
            int end = scan.nextInt();
            int[] check = Arrays.copyOfRange(arr,start-1, end);
            for (int j = 0; j < check.length; j++){
                arr[start-1 + j] = check[check.length -1 - j];
            }

        }
        
        for (int k : arr){
            System.out.print(k+ " ");
        }
    }
}
