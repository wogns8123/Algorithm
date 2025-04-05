import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static ArrayList<ArrayList<Integer>> graph = new ArrayList<>();

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int V = Integer.parseInt(st.nextToken());

        // graph 초기화
        for (int i = 0; i <= N; i++) {
            graph.add(new ArrayList<>());
        }

        // graph 입력
        for(int i = 0; i<M ; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            int u = Integer.parseInt(st2.nextToken());
            int v = Integer.parseInt(st2.nextToken());
            graph.get(u).add(v);
            graph.get(v).add(u);
        }
        // 방문 순서 보장을 위해
        for(int i = 0; i<graph.size();i++){
            Collections.sort(graph.get(i));
        }

        // dfs
        int[] visited_dfs = new int[N+1];
        Stack<Integer> stack = new Stack<>();
        stack.push(V);
        while(!stack.isEmpty()){

            int next = stack.pop();

            if(visited_dfs[next] == 1){
                continue;
            }

            visited_dfs[next] = 1;
            System.out.print(next + " ");

            List<Integer> node = graph.get(next);
            for(int i = node.size() -1 ; i>=0 ; i--){
                int node_next = node.get(i);
                if(visited_dfs[node_next] == 0){
                    stack.add(node_next);
                }
            }
        }
        System.out.println();

        // bfs
        int[] visited_bfs = new int[N+1];
        Queue<Integer> que = new ArrayDeque<>();
        visited_bfs[V] = 1;
        que.add(V);
        while(!que.isEmpty()){
            int next = que.poll();
            System.out.print(next + " ");
            for(int node : graph.get(next)){
                if(visited_bfs[node] == 0){
                    visited_bfs[node] = 1;
                    que.add(node);
                }
            }
        }
    }
}
