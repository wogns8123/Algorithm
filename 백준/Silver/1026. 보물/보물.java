import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] A = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] B = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(A);
        B = Arrays.stream(B)
                .boxed()
                .sorted((a,b) -> b-a)
                .mapToInt(i -> i)
                .toArray();
        int result = 0;
        for(int i = 0; i< N ; i++){
            result += A[i] * B[i];
        }
        System.out.println(result);
    }
}
