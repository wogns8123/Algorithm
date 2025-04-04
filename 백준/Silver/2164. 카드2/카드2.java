import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        Queue<Integer> que = new LinkedList<>();
        for(int i = 0 ; i< num ; i++){
            que.add(i+1);
        }
        while(que.size() > 1){
            que.poll();
            if(que.size() == 1){
                break;
            }
            que.add(que.poll());
        }
        System.out.println(que.peek());
    }
}
