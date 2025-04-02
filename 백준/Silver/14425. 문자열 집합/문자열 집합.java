import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        int count = 0;
        HashMap<String, Integer> nSet = new HashMap<>();
        for(int i = 0; i<N; i++){
            nSet.put(br.readLine(), 1);
        }
        for(int i = 0 ; i<M; i++){
            String word = br.readLine();
            if (nSet.containsKey(word)){
                count ++;
            }
        }
        System.out.println(count);
    }
}
