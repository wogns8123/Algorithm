import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int MAX = Integer.MIN_VALUE;
        int MIN = Integer.MAX_VALUE;
        for(int i = 0; i < num ; i++){
            int input = Integer.parseInt(st.nextToken());
            MAX = Math.max(input, MAX);
            MIN = Math.min(input,MIN);
        }
        System.out.println(MAX * MIN);
    }
}
