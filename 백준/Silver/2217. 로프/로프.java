import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = new int[N];
        for(int i = 0; i< N ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        arr = Arrays.stream(arr)
                    .boxed()
                    .sorted((a,b) -> b-a)
                    .mapToInt(i->i)
                    .toArray();

        int max = 0;
        for(int i = 0; i<N; i++){
            int weight = arr[i] * (i+1);
            if(max < weight){
                max = weight;
            }
        }
        System.out.println(max);

    }
}
