import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] result = new int[N];
        result[0] = arr[0];
        for(int i = 2; i<=N; i++){
            result[i-1] = result[i-2] + arr[i-1];
        }

        for(int i = 0; i< M ; i++){
            StringTokenizer check = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(check.nextToken());
            int b = Integer.parseInt(check.nextToken());
            System.out.println(result[b-1]- result[a-1] + arr[a-1]);
        }
    }
}
