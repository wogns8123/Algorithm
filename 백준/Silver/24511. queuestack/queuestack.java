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
        Deque<Integer> deque = new ArrayDeque<>();
        int[] type = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] value = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        // deque 생성
        // 큐 일 경우만 변경이 발생하니 type으로 0만
        for(int i =0; i<testCase;i++){
            if (type[i] == 0){
                deque.addFirst(value[i]);
            }
        }

        //
        int testCase2 = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<testCase2;i++){
            int input = Integer.parseInt(st.nextToken());
            deque.addLast(input);
            sb.append(deque.pollFirst()).append(" ");
        }
        System.out.println(sb.toString());

    }
}
