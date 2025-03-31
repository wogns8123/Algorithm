import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int maxN = 0;

        if(arr[0]>arr[1]){
            if (arr[1]>arr[2]) maxN = arr[0];
            else maxN = (arr[0]>arr[2])?arr[0]:arr[2];
        }
        else{
            maxN = arr[1] > arr[2] ? arr[1]:arr[2];
        }
        if(arr[0] + arr[1] + arr[2] -maxN > maxN) System.out.println(arr[0]+arr[1]+arr[2]);
        else System.out.println((arr[0] + arr[1] + arr[2] - maxN)*2 - 1);
    }
}
