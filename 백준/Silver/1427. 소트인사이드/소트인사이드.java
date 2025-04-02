import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] arr = br.readLine().split("");
        int[] numArr = new int[arr.length];
        for(int i = 0; i<arr.length; i++){
            numArr[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(numArr);
        for(int i = 0; i<numArr.length/2 ; i++){
            int temp = numArr[i];
            numArr[i] = numArr[numArr.length-1-i];
            numArr[numArr.length-1-i] = temp;
        }
        for(int k : numArr){
            System.out.print(k);
        }

    }
}
