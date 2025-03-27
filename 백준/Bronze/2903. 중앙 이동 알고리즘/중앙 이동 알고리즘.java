import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        scan.nextLine();
        System.out.println((int)Math.pow(Math.pow(2,number)+1,2));
    }
}
