import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    static int[][] graph;
    static int count = 0;
    static boolean[] visited;
    static Stack<Integer> stack;
    public static void dfs(int n){
        stack.push(n);
        while(!stack.isEmpty()){
            int node = stack.pop();
            if(!visited[node]){
                visited[node] = true;
            }
            for(int i = 1; i<graph.length;i++){
                if (graph[node][i] == 1 && !visited[i]){
                    visited[i] = true;
                    stack.push(i);
                }
            }
        }
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        graph = new int[N+1][N+1];
        for(int i = 0; i<M; i++){
            StringTokenizer s2 = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(s2.nextToken());
            int v= Integer.parseInt(s2.nextToken());
            graph[u][v] = 1;
            graph[v][u] = 1;
        }
        stack = new Stack<>();
        visited = new boolean[N+1];
        for(int i = 1; i<=N; i++){
            if(!visited[i]){
                dfs(i);
                count++;
            }
        }
        System.out.println(count);

    }
}
