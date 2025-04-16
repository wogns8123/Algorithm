import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(arr);
        
        int left = 0;
        int right = arr.length-1;
        int differ = Integer.MAX_VALUE;
        int find1 = 0;
        int find2 = 0;
        while(left < right){
            int sum = arr[left] + arr[right];
            int absSum = Math.abs(sum);

            if(absSum < differ){
                differ = absSum;
                find1 = arr[left];
                find2 = arr[right];
            }
            if (sum < 0){
                left ++;
            } else {
                right --;
            }
        }
        System.out.println(find1 + " " + find2);
    }
}
