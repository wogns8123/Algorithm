import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        int[] dx = {0,1,0,-1};
        int[] dy = {1,0,-1,0};
        int[][] arr = new int[M][N];
        boolean[][] visited = new boolean[M][N];

        int total = 0;
        int count = 0;
        // 현 위치
        int nowX = 0;
        int nowY = 0;
        visited[nowX][nowY] = true;
        total = 1;

        int idx = 0;
        while(total < M * N){
            int nx = nowX + dx[idx];
            int ny = nowY + dy[idx];

            if(nx>=0 && nx < M && ny >=0 && ny < N && !visited[nx][ny]){
                total ++;
                visited[nx][ny] = true;
                nowX = nx;
                nowY = ny;
            }
            else{
                idx = (idx + 1) % 4;
                count++;
            }
        }
        System.out.println(count);
    }
}
