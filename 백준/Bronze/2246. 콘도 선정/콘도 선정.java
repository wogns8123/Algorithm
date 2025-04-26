import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        for(int i = 0; i<N;i++){
            arr[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        Arrays.sort(arr, (a,b) ->{
            if(a[0] == b[0]){
                return a[1]-b[1];
            } else{
                return a[0]- b[0];
            }
        });
        int count = 0;
        int max = Integer.MAX_VALUE;
        for(int i = 0; i<N ;i++){
            if(arr[i][1] < max){
                count ++;
                max = arr[i][1];
            }
        }
        System.out.println(count);
    }
}
