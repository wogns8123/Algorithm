import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int testCase = Integer.parseInt(br.readLine());
        int max_a = -10000, max_b = -10000, min_a = 10000, min_b = 10000;
        for(int i = 0; i <testCase; i++){
            int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            min_a = min_a>arr[0]?arr[0]:min_a;
            min_b = min_b>arr[1]?arr[1]:min_b;
            max_a = max_a<arr[0]?arr[0]:max_a;
            max_b = max_b<arr[1]?arr[1]:max_b;
        }
        
        System.out.println(((max_b-min_b) * (max_a-min_a)));
    }
}
