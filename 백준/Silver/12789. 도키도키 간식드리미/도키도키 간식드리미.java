import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        Queue<Integer> que = new LinkedList<>();
        Stack<Integer> stack = new Stack<>();

        for(int i =0;i<num;i++){
            que.add(Integer.parseInt(st.nextToken()));
        }

        int student = 1;
        while (!que.isEmpty() || !stack.isEmpty()){
            if(!que.isEmpty() && que.peek() == student){
                que.poll();
                student ++;
            } else if(!stack.isEmpty() && stack.peek() == student){
                stack.pop();
                student ++;
            }

            else if(!que.isEmpty()){
                stack.push(que.poll());
            } else {
                System.out.println("Sad");
                return;
            }
        }
        System.out.println("Nice");
    }
}
