import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void countingSort(int[] arr, int max){
        int[] count = new int[max+1];

        for(int num : arr){
            count[num]++;
        }

        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<= max; i++) {
            while (count[i] > 0) {
                sb.append(i).append("\n");
                count[i]--;
            }
        }
        System.out.println(sb);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        int[] arr = new int[num]; // 그냥 배열
        int max = 0;

        for(int i = 0; i < num ; i++){
            arr[i] = Integer.parseInt(br.readLine());
            if(arr[i] > max) max = arr[i];
        }
        countingSort(arr, max);

    }
}
