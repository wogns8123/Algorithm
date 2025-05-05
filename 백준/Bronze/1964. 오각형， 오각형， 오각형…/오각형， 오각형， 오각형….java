import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[10000001];
        arr[1] = 5;
        arr[2] = 12;
        for(int i = 3; i<= N; i++){
            int result = arr[i-1] + (i+1)*2 + i-1;
            arr[i] = result%=45678;
        }
        System.out.println(arr[N]);
    }
}
