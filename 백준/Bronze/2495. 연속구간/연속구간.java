import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        for(int i = 0; i< 3; i++){
            String word = br.readLine();
            int count = 1;
            char first = word.charAt(0);
            int max = 0;
            for(int q = 1; q< word.length(); q++){
                if (first == word.charAt(q)){
                    count++;
                } else{
                    first = word.charAt(q);
                    max = Math.max(count,max);
                    count = 1;
                }
                max = Math.max(count,max);
            }
            System.out.println(max);

        }
    }
}
