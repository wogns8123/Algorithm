import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static boolean isPrime(int num){
        if(num < 2) return false;
        if(num == 2) return true;
        if(num % 2 ==0) return false;

        for(int i = 3; i*i <= num ; i+=2){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {

        // 에라토스테네스의 체
        int MAX = 1000000;
        boolean[] isPrime = new boolean[MAX + 1];
        for(int i = 2; i<=MAX; i++){
            isPrime[i] = true;
        }
        for(int i = 2; i*i<=MAX; i++){
            if(isPrime[i]){
                for(int j = i*i ; j<=MAX;j+=i){
                    isPrime[j] = false;
                }
            }
        }




        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for(int i = 0; i < testCase; i++){
            int num = Integer.parseInt(br.readLine());
            int count = 0;
            for(int j = 2; j<= num/2; j++){
                if (isPrime[j] && isPrime[num - j]){
                    count++;
                }
            }
            System.out.println(count);
        }
    }
}
