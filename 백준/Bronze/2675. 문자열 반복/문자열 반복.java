import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();

        for(int i = 0; i< testCase; i++){
            int number = scan.nextInt();
            String word = scan.next();

            for(int j=0; j<word.length(); j++){
                for(int k=0; k<number; k++){
                    System.out.print(word.charAt(j));
                }
            }
            System.out.println();
        }
    }
}
