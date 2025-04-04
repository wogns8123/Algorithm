import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        Stack<Integer> stack = new Stack<>();
        for(int i = 0; i< testCase; i++){
            int num = Integer.parseInt(br.readLine());
            if(num!=0){
                stack.push(num);
            } else{
                stack.pop();
            }
        }
        int sum = 0;
        for(int k : stack){
            sum += k;
        }
        System.out.println(sum);
    }
}
