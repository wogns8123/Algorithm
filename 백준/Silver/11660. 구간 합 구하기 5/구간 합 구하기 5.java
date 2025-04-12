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
        int M = Integer.parseInt(st.nextToken());
        int[][] arr = new int[N][N];
        int[][] res = new int[N+1][N+1];
        for(int i = 1; i <= N ; i++){
            StringTokenizer arrNum = new StringTokenizer(br.readLine());
            for(int j = 1; j<=N; j++){
                res[i][j] = res[i][j-1] + Integer.parseInt(arrNum.nextToken());
            }
        }
        StringBuilder sb = new StringBuilder();
        for(int i = 1; i<=M; i++){
            int sum = 0;
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(st2.nextToken());
            int y1 = Integer.parseInt(st2.nextToken());
            int x2 = Integer.parseInt(st2.nextToken());
            int y2 = Integer.parseInt(st2.nextToken());
            for(int j = x1; j<=x2; j++){
                sum = sum + res[j][y2] -res[j][y1-1];
            }
            sb.append(sum+"\n");
        }
        System.out.println(sb.toString());
    }
}
