import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[][] arr = new int[N][2];
        for(int i = 0; i< N ;i++){
            int[] check = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            arr[i] = check;
        }

        Arrays.sort(arr, (a,b) -> {
            if(a[1] == b[1]){
                return Integer.compare(a[0],b[0]);
            }else {
                return Integer.compare(a[1],b[1]);
            }
        });
        int endTime = 0;
        int count = 0;
        for(int i = 0; i<N;i++){
            if(endTime<=arr[i][0]){
                endTime = arr[i][1];
                count ++;
            }
        }
        System.out.println(count);
    }
}
