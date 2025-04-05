import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    static int[][] graph;
    static int num;
    static int[] dx = {-1,1,0,0};
    static int[] dy = {0,0,-1,1};
    static int totalCount = 0;
    public static int dfs(int x, int y){
        graph[x][y] = 0;
        int count = 1;
        for(int i = 0; i<4; i++){
            int nx = x + dx[i];
            int ny = y + dy[i];
            if(nx>=0 && ny>=0 && nx< num && ny<num && graph[nx][ny] == 1){
                count += dfs(nx,ny);

            }
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        num = Integer.parseInt(br.readLine());
        graph = new int[num][num];
        for(int i = 0; i < num ; i++){
            int[] a = Arrays.stream(br.readLine().split("")).mapToInt(Integer::parseInt).toArray();
//            System.out.println(Arrays.toString(a));
            graph[i] = a;
        }
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i<num;i++){
            for(int j =0 ; j<num ; j++){
                if (graph[i][j] == 1){
                    arr.add(dfs(i,j));
                    totalCount++;
                }
            }
        }
        Collections.sort(arr);
        System.out.println(totalCount);
        for(int k : arr){
            System.out.println(k);
        }

    }
}
