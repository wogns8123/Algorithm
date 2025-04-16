import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int x = Integer.parseInt(br.readLine());
        int count =0;
        Arrays.sort(arr);

        for(int i=0;i<N-1;i++){
            for (int j=i+1;j<N;j++){
                if(arr[i] + arr[j] > x){
                    break;
                }
                if(arr[i] + arr[j] == x){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
