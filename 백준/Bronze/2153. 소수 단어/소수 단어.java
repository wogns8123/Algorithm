import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static boolean isPrime(int num){
        for(int i = 2; i <= Math.sqrt(num); i++){
            if(num % i == 0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        char[] word = br.readLine().toCharArray();
        int wordNum = 0;
        for(int i = 0; i< word.length; i++){
            if (word[i] >= 'a' && word[i] <= 'z'){
                wordNum += word[i] - 'a' + 1;
            } else if (word[i] >= 'A' && word[i] <='Z'){
                wordNum += word[i] - 'A' + 27;
            }
        }
        if (isPrime(wordNum)){
            System.out.println("It is a prime word.");
        } else{
            System.out.println("It is not a prime word.");
        }


    }
}
