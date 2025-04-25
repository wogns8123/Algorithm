import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.Set;

public class Main {
    static int N;
    static String[][] arr;
    static boolean[] visited;
    static Set<Integer> friends;
    public static void dfs(int start, int curr, int depth){
        if (depth > 2) return;
        if(depth>0){
            friends.add(curr);
        }

        for(int i = 0; i< N;i++){
            if(!visited[i] && arr[curr][i].equals("Y")){
                visited[i] = true;
                dfs(start, i, depth+1);
                visited[i] = false;
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new String[N][N];
        for(int i = 0 ; i < N; i++){
            arr[i] = br.readLine().split("");
        }

        int max = 0;
        for(int i = 0; i<N;i++){
            visited = new boolean[N];
            friends = new HashSet<>();

            visited[i] = true;
            dfs(i,i,0);
            max = Math.max(max, friends.size());
        }
        System.out.println(max);
    }
}
