import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int val = 0;
        int count = 0;
        for (int i = 0; i<9; i++){
            int num = Integer.parseInt(br.readLine());
            if(num > val){
                val = num;
                count = i+1;
            }
        }
        System.out.println(val);
        System.out.println(count);

    }
}
