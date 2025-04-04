import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;
import java.util.Stack;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        for(int i = 0; i<num; i++){
            String word = br.readLine();
            Stack<Character> stack = new Stack<>();
            boolean check = true;
            for(char c : word.toCharArray()) {

                if (c == '(') {
                    stack.push(c);
                } else if(c == ')'){
                    if(stack.isEmpty()){
                        check = false;
                        break;
                    }
                    stack.pop();
                }
            }
            if (check && stack.isEmpty()) {
                System.out.println("YES");
            } else{
                System.out.println("NO");
            }
        }
    }
}
