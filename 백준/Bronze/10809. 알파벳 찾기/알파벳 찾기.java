import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.next();
        int[] result = new int[26];

        Arrays.fill(result,-1);

        for (int i = 0; i< word.length(); i++){
            char ch = word.charAt(i);
            if (result[ch-'a'] == -1){
                result[ch-'a'] = i;
            }
        }
        for(int k : result){
            System.out.print(k + " ");
        }

    }
}
