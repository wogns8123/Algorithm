import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[][] newArr = new int[N][2];

        // 인덱스 포함 arr 생성
        for(int i = 0; i< N; i++){
            newArr[i] = new int[]{arr[i], i};
        }

        Arrays.sort(newArr,(a,b)->{
            if(a[0] == b[0]){
                return a[1] - b[1];
            } else {
                return a[0] - b[0];
            }
        });
        
        int[] P = new int[N];

        for (int i = 0; i < N; i++) {
            int originalIndex = newArr[i][1];
            P[originalIndex] = i;
        }
        for(int k : P){
            System.out.print(k + " ");
        }
    }
}
