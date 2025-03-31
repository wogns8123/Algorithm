import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int number = Integer.parseInt(st.nextToken());
        int maxNumber = Integer.parseInt(st.nextToken());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int total = 0;
        for(int i = 0; i< arr.length-2; i++){
            for(int j = i+1; j<arr.length-1;j++){
                for(int k = j+1; k<arr.length;k++){
                    if (total < arr[i]+arr[j]+arr[k] && arr[i]+arr[j]+arr[k] <=maxNumber){
                        total = arr[i]+arr[j]+arr[k];
                    }
                }
            }
        }
        System.out.println(total);

    }
}
