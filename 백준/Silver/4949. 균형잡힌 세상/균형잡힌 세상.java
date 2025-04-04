import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static boolean check(String word){
        Stack<Character> stack = new Stack<>();
        for(char c : word.toCharArray()) {
            if(c == '(' || c == '['){
                stack.push(c);
            } else if (c == ')') {
                if(stack.isEmpty() || stack.pop() != '('){
                    return false;
                }
            } else if (c == ']'){
                if(stack.isEmpty() || stack.pop() != '['){
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while(true){
            String word = br.readLine();
            if (word.equals(".")){
                break;
            }
            if(check(word)){
                System.out.println("yes");
            } else{
                System.out.println("no");
            }


        }
    }
}
