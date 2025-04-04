import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        Queue<Integer> que = new LinkedList<>();
        for(int i = 1; i<=N;i++){
            que.add(i);
        }
        StringBuilder sb = new StringBuilder();
        sb.append("<");

        while (!que.isEmpty()){
            for(int i = 0; i<K-1; i++){
                que.add(que.poll());
            }
            sb.append(que.poll());
            if(!que.isEmpty()){
                sb.append(", ");
            }
        }
        sb.append(">");
        System.out.println(sb.toString());
    }
}
