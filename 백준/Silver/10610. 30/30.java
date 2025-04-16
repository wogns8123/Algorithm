import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();

        int sum = 0;
        boolean hasZero = false;

        for(char c : word.toCharArray()){
            sum += Character.getNumericValue(c);
            if(c == '0'){
                hasZero = true;
            }
        }
        if(sum %3 != 0 || !hasZero){
            System.out.println(-1);
            return;
        }
        char[] arr = word.toCharArray();
        Arrays.sort(arr);
        StringBuilder sb = new StringBuilder();
        for(int i = arr.length-1; i>=0; i--){
            sb.append(arr[i]);
        }
        System.out.println(sb);

    }

}
