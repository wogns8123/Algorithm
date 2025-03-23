import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import static java.lang.Math.max;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input = br.readLine();
        String[] tokens = input.split(" ");
        String A = tokens[0];
        String B = tokens[1];
        String check_A = "";
        String check_B = "";
        // 뒤집기
        for(int i = 2; i>=0; i--){
            check_A += A.charAt(i);
            check_B += B.charAt(i);
        }

        System.out.println(max(Integer.parseInt(check_A), Integer.parseInt(check_B)));

    }
}
