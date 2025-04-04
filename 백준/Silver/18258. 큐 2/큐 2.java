import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        Queue<Integer> que = new LinkedList<>();
        StringBuilder sb = new StringBuilder();
        int lastValue = -1;

        for(int i = 0; i< testCase; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();

            switch (command){
                case "push":
                    int num = Integer.parseInt(st.nextToken());
                    que.add(num);
                    lastValue = num;
                    break;
                case "pop" :
                    if(que.isEmpty()){
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(que.poll()).append("\n");
                    }
                    break;
                case "size" :
                    sb.append(que.size()).append("\n");
                    break;
                case "empty":
                    if(que.isEmpty()){
                        sb.append("1").append("\n");
                    } else {
                        sb.append("0").append("\n");
                    }
                    break;
                case "front":
                    if (que.isEmpty()){
                        sb.append("-1").append("\n");
                    } else{
                        sb.append(que.peek()).append("\n");
                    }
                    break;
                case "back":
                    if (que.isEmpty()){
                        sb.append("-1").append("\n");
                    } else {
                        sb.append(lastValue).append("\n");
                    }
                    break;
            }
        }
        System.out.println(sb.toString());
    }
}
