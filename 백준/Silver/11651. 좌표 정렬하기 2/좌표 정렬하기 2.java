import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[][] arr = new int[num][];
        for(int i = 0 ; i<num ; i++){
            arr[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        Arrays.sort(arr, (a,b) -> {
            if(a[1] == b[1]){
                return Integer.compare(a[0], b[0]);
            }
            return Integer.compare(a[1],b[1]);
        });
        
        for(int[] result : arr){
            System.out.println(result[0] + " " + result[1]);
        }
    }
}
