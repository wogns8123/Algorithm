import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.Deque;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        Deque<int[]> deque = new ArrayDeque<>();
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i< testCase; i++){
            deque.addLast(new int[]{i+1, Integer.parseInt(st.nextToken())});
        }
        while(!deque.isEmpty()){
            int[] start = deque.pollFirst();
            sb.append(start[0]).append(" ");
            int move = start[1];
            if(deque.isEmpty()){
                break;
            }
            if (move>0){
                for(int i = 1; i<move;i++){
                    deque.addLast(deque.pollFirst());
                }
            } else {
                for(int i = 0; i<-move; i++){
                    deque.addFirst(deque.pollLast());
                }
            }
        }
        System.out.println(sb.toString());
    }
}
