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
        Arrays.sort(arr);

        int left = 0;
        int right = arr[N-1];
        int result = 0;

        while(left<=right){
            // 자를 높이
            int middle = (left + right) / 2;
            // 자른 값
            long total = 0;

            for(int i = 0; i< N; i++){
                if(arr[i] > middle){
                    total += (arr[i] - middle);
                }
            }

            if(total >= M){
                result = middle;
                left = middle +1;
            } else{
                right = middle - 1;
            }
        }
        System.out.println(result);


    }
}
