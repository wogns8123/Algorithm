import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Collections;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for(int i = 0; i< testCase;i++){
            // 첫번째 케이스
            int N = Integer.parseInt(br.readLine());

            int count = 1;
            int[][] arr = new int[N][2];
            // arr 초기화
            for(int q = 0 ; q< N;q++){
                arr[q] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            }
            // arr 0번 인덱스로 정렬
            Arrays.sort(arr, (a,b) -> {
                return Integer.compare(a[0], b[0]);
            });
            int minInterview = arr[0][1];

            for(int q = 1; q < N; q++){
                int interview = arr[q][1];
                if(interview<minInterview){
                    count ++;
                    minInterview = Math.min(minInterview, interview);

                }
            }
            System.out.println(count);
        }
    }
}
