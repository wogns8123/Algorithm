import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        int num = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack();
        StringBuilder sb = new StringBuilder();
        for(int i = 0 ; i<num ; i++){
            String command = br.readLine();
            st = new StringTokenizer(command);

            switch (st.nextToken()){
                case "1" :
                    stack.push(Integer.parseInt(st.nextToken()));
                    break;
                case "2":
                    if(stack.isEmpty()){
                        sb.append(-1).append("\n");
                    } else {
                        sb.append(stack.pop()).append("\n");
                    }
                    break;
                case "3" :
                    sb.append(stack.size()).append("\n");
                    break;
                case "4" :
                    if(stack.isEmpty()) {
                        sb.append(1).append("\n");
                    } else{
                        sb.append(0).append("\n");
                    }
                    break;
                case "5" :
                    if(stack.isEmpty()){
                        sb.append(-1).append("\n");
                    } else{
                        sb.append(stack.peek()).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb.toString());
    }
}
