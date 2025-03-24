import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        String[] wordList = {"c=", "c-", "dz=", "d-", "lj", "nj", "s=", "z="};
        int count = 0;

        for(String alphabet: wordList){
            word = word.replace(alphabet, " ");
        }

        for (int i = 0; i< word.length(); i++){
            if (word.charAt(i) == ' '){
                count += 1;
            }
        }
        System.out.println(word.length());
    }
}
