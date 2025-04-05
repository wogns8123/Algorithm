import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int link = Integer.parseInt(br.readLine());
        int[][] graph = new int[num+1][num+1];

        for(int i = 0; i<link; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            graph[a][b] = 1;
            graph[b][a] = 1;
        }

        int count = 0;
        boolean[] visited = new boolean[num+1];
        Stack<Integer> stack = new Stack<>();
        stack.push(1);
        visited[1] = true;
        while(!stack.isEmpty()){
            int node = stack.pop();
            for(int i = 0; i <= num ; i++){
                if(graph[node][i] == 1 && !visited[i]){
                    visited[i] = true;
                    count ++;
                    stack.push(i);
                }
            }
        }
        System.out.println(count);



    }
}
