import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int number = Integer.parseInt(st.nextToken());
        for(int i = 0 ; i < number ; i++){
            StringTokenizer st2 = new StringTokenizer(br.readLine(), ",");
            int a = Integer.parseInt(st2.nextToken());
            int b = Integer.parseInt(st2.nextToken());
            System.out.println(a+b);
        }
    }
}
