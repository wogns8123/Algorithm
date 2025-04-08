import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    static boolean isPrime(long num){
        if(num < 2) return false;
        if(num == 2) return true;
        if(num % 2 ==0) return false;

        for(int i = 3; i*i <= num; i+=2){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());
        for(int i = M; i<=N ; i++){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
    }
}
