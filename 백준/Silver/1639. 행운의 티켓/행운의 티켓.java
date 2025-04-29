import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static int StringSum(String S){
        int sum = 0;
        for(int i =0 ;i<S.length();i++){
            sum+= S.charAt(i) - '0';
        }
        return sum;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String S = br.readLine();

        int result = 0;
        int N = 0;
        for(int i = 1; i<=S.length(); i++){
            N = i * 2;
            for(int j = 0; j <S.length()-N+1 ; j++){
                String temp = S.substring(j,j+N);
                if(StringSum(temp.substring(0,N/2)) == StringSum(temp.substring(N/2))){
                    result = N;
                    break;
                }
            }
        }
        System.out.println(result);



    }
}
