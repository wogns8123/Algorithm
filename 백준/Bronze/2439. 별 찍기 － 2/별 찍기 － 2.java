import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        String star = " ".repeat(number);

        for (int i = 1; i<= number; i++){
            for ( int j = 1; j<=number-i; j++){
                System.out.print(" ");
            }
            for ( int j = 0; j<i; j ++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}