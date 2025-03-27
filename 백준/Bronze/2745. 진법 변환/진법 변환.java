import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char[] word = scan.next().toCharArray();
        int number = scan.nextInt();
        int total = 0;

        for(int i = word.length-1; i>=0; i--){
            int value;
            if (Character.isAlphabetic(word[i])){
                value = word[i] - 'A' + 10;
            } else{
                value = word[i] - '0';
            }
            total += value * (int)Math.pow(number,word.length-1-i);
        }
        System.out.println(total);
    }
}
