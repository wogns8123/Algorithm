import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        int[] arr = new int[302];
        arr[1] = 1;
        arr[2] = 3;
        arr[3] = 6;
        for(int i = 4; i< 302; i++){
            arr[i] = arr[i-1] + i;
        }
        for(int i = 0; i< testCase; i++){
            int n = Integer.parseInt(br.readLine());
            int result = 0;

            for(int j = 1; j< n+1 ; j++){
                result += j * arr[j+1];
            }
            System.out.println(result);
        }

    }
}
