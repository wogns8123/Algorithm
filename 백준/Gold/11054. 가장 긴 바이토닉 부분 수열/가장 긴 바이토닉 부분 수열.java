import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] dpP = new int[num];
        int[] dpM = new int[num];

        for(int i = 0; i<num; i++){
            dpP[i] = 1;
            for(int j = 0; j<i; j++){
                if(arr[j] < arr[i]){
                    dpP[i] = Math.max(dpP[i], dpP[j]+1);
                }
            }
        }

        for(int i = num-1; i>=0;i--){
            dpM[i] = 1;
            for(int j =num-1; j>i; j--){
                if(arr[j] < arr[i]){
                    dpM[i] = Math.max(dpM[i], dpM[j]+1);
                }
            }
        }
        int max = 0;
        for(int i = 0; i< num ; i++){
            max =Math.max(max, dpP[i] + dpM[i] -1);
        }
        System.out.println(max);
    }
}
