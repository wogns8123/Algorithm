import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int testCase = scan.nextInt();
        scan.nextLine();
        for (int i = 0; i<testCase; i++){
            String word = scan.nextLine();
            System.out.println(word.charAt(0) + "" + word.charAt(word.length()-1) );
        }
    }
}
