import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> pocket = new HashMap<>();
        HashMap<Integer, String> reverseMap = new HashMap<>();
        for(int i = 0;i<N;i++){
            String name = br.readLine();
            pocket.put(name, i+1);
            reverseMap.put(i+1, name);
        }

        for(int i = 0; i < M ; i++){
            String input = br.readLine();

            if(input.matches("^[a-zA-z]+$")){
                System.out.println(pocket.get(input));
            } else {
                int num = Integer.parseInt(input);
                System.out.println(reverseMap.get(num));
            }
        }
    }
}
