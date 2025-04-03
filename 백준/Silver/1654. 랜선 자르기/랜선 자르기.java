import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int K = Integer.parseInt(st.nextToken());
        long N = Long.parseLong(st.nextToken());
        int[] arr = new int[K];
        for(int i = 0; i<K ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        long left = 1;
        long right = arr[K-1];
        long result = 0;
        while (left<= right){
            // 자를 길이
            long middle = (left + right)/2;
            // 자른 갯수
            long check = 0;


            for(int i = 0; i<K ; i++ ){
                check += arr[i] / middle;
            }

            if(check >= N){
                result = middle;
                left = middle + 1;
            } else{
                right = middle - 1;
            }
        }
        System.out.println(result);

    }
}
