import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] Narr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int M = Integer.parseInt(br.readLine());
        int[] Marr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        HashMap<Integer, Integer> NMap = new HashMap<>();
        for(int i = 0 ; i < N ; i++){
            NMap.put(Narr[i], NMap.getOrDefault(Narr[i],0) + 1);
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i<M ; i++){
            if (NMap.get(Marr[i]) == null){
                sb.append(0).append(" ");
            }
            else {
                sb.append(NMap.get(Marr[i])).append(" ");
            }
        }
        System.out.println(sb.toString());


    }
}
