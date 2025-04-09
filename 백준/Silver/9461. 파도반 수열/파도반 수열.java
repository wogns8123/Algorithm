import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        long[] arr = new long[101];
        arr[1] = 1;
        arr[2] = 1;
        arr[3] = 1;
        for(int j = 4; j <= 100; j++){
            arr[j] = arr[j-2] + arr[j-3];
        }
        for(int i = 0 ; i< testCase; i++){
            int n = Integer.parseInt(br.readLine());
            System.out.println(arr[n]);
        }
    }
}
