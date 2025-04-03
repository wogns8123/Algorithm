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
        int C = Integer.parseInt(st.nextToken());
        int[] arr = new int[N];
        for(int i = 0; i < N ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);

        int left = 1;
        int right = arr[N-1] - arr[0];
        int result = 0;
        while(left <= right){
            int middle = (left + right)/2;
            int installed = 1;
            int lastInstalled = arr[0];

            for(int i = 0; i < N ; i++){
                if (arr[i] - lastInstalled >= middle){
                    installed++;
                    lastInstalled = arr[i];
                }
            }

            if(installed >= C){
                result = middle;
                left = middle +1;
            } else {
                right = middle - 1;
            }

        }
        System.out.println(result);
    }
}
