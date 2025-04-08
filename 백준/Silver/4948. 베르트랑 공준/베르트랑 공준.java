import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static boolean isPrime(long num){
        if (num<2) return false;
        if (num == 2) return true;
        if (num%2==0)return false;
        for(int i = 3; i*i <= num; i+=2){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        while(true){
            int num = Integer.parseInt(br.readLine());
            if(num == 0){
                break;
            }
            int count = 0;
            for(int i = num+1; i <= 2*num ; i++){
                if (isPrime(i)){
                    count += 1;
                }
            }
            System.out.println(count);
        }
    }
}
