import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        for(int i = L; i <= 100; i++){
            int temp = N - (i * (i-1) / 2);
            if(temp <0) break;
            if(temp % i == 0){
                int start = temp / i;
                for(int j = 0; j<i ; j++){
                    System.out.print((start + j) + " ");
                }
                return;
            }
        }
        System.out.println(-1);
    }
}
