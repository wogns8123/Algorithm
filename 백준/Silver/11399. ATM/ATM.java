import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);
        
        int[] res = new int[N];
        res[0] = arr[0];
        for(int i = 1;i<N;i++){
            res[i] = res[i-1] + arr[i];
        }
        int total = 0;
        for(int k : res){
            total+=k;
        }
        System.out.println(total);
    }
}
