import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int M = scanner.nextInt();
        // arr 배열 생성
        int[] arr = new int[N];
        for(int i = 0; i<N;i++){
            arr[i] = i+1;
        }
        // 교환
        for(int i = 0; i < M; i++){
            int first = scanner.nextInt();
            int second = scanner.nextInt();
            int a = arr[first-1];
            arr[first-1] = arr[second-1];
            arr[second-1] = a;
        }
        
        for(int k: arr){
            System.out.print(k + " ");
        }
    }
}
