import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);
        int left = 0 ;
        int right = N-1;
        int count = 0;
        while(left < right) {
            if (arr[left] + arr[right] == M) {
                count++;
                left++;
                right--;
            }else if (arr[left] + arr[right] < M) {
                left++;
            } else {
                right--;
            }
        }

        System.out.println(count);
    }
}
