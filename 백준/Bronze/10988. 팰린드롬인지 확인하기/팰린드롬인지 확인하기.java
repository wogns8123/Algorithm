import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        char[] wordArr = word.toCharArray();

        for(int i = 0; i< wordArr.length/2 ; i++){
            char temp = wordArr[i];
            wordArr[i] = wordArr[wordArr.length - 1 - i];
            wordArr[wordArr.length - 1 - i] = temp;
        }
        String word2 = new String(wordArr);
        if ( word.equals(word2)){
            System.out.println(1);
        } else{
            System.out.println(0);
        }
    }
}
