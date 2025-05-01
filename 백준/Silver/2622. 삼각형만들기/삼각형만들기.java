import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        
        int count = 0;
        for(int i = 1; i <= n/3; i++){
            for (int j = i; j <= (n-i)/2; j++){
                int q = n - i - j;
                if(j <= q && i + j > q){
                    count += 1;
                }

            }
        }
        System.out.println(count);
    }
}
