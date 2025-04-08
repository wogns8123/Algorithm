import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static boolean isPrime(long num){
        if(num < 2){
            return false;
        }
        if (num == 2) return true;
        if(num%2 == 0) return false;
        for(long i = 3; i*i<=num; i+=2){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        long testCase = Long.parseLong(br.readLine().trim());
        for(int i = 0; i<testCase;i++){
            long number = Long.parseLong(br.readLine().trim());
            while (!isPrime(number)){
                number++;
            }
            System.out.println(number);
        }
    }
}
