import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int up = scan.nextInt();
        int down = scan.nextInt();
        int total = scan.nextInt();
        System.out.println((int)(Math.ceil((total-up)/(double)(up-down)+1)));
    }
}
