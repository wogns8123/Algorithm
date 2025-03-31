import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for(int x = -999 ; x<=999 ; x++){
            for(int y = -999;y<=999; y++){
                if(arr[0] * x + arr[1] * y == arr[2] && arr[3] * x + arr[4] * y == arr[5]){
                    System.out.println(x + " " + y);
                }
            }
        }
    }
}
