import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        for(int i = 0; i<num ; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = Integer.parseInt(st.nextToken());
            int M = Integer.parseInt(st.nextToken());
            int n = N;
            int m = M;
            while(m != 0){
                int temp = n%m;
                n = m;
                m = temp;
            }
            int answer = n; // 최대공약수
            System.out.println((N * M)/answer);

        }
    }
}
