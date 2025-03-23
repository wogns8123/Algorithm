import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        scan.nextLine();
        String word = scan.nextLine();
        int total = 0;
        
        char[] charArr = word.toCharArray();
        
        for (int i = 0; i < word.length(); i++){
//            int number = word.charAt(i);
//            total += number;
            total += Character.getNumericValue(charArr[i]);
        }
        System.out.println(total);
    }
}
