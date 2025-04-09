import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num+2];
        arr[1] = 1;
        arr[2] = 2;
        for(int i = 3; i<= num; i++){
            arr[i] = (arr[i-1] + arr[i-2])%15746;
        }
        System.out.println(arr[num]);

    }
}
