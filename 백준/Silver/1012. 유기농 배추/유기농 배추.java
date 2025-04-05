import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static int N;
    static int M;

    static int[][] graph;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    public static void dfs(int x, int y){
        graph[x][y] = 0;
        for(int i = 0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if (nx>=0 && ny >=0 && nx< M && ny < N && graph[nx][ny] == 1){
                dfs(nx,ny);
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for(int i = 0; i< testCase; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            M = Integer.parseInt(st.nextToken());
            N = Integer.parseInt(st.nextToken());
            int K = Integer.parseInt(st.nextToken());
            graph = new int[M][N];

            //그래프 생성
            for(int j = 0; j<K ; j++){
                StringTokenizer s2 = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(s2.nextToken());
                int y = Integer.parseInt(s2.nextToken());
                graph[x][y] = 1;
            }

            int count = 0;
            for(int x = 0 ; x<M;x++){
                for(int y = 0; y<N; y++){
                    if (graph[x][y] == 1){
                        dfs(x,y);
                        count++;
                    }
                }
            }
            System.out.println(count);

        }
    }
}
