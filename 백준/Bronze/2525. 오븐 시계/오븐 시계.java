import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int H = scan.nextInt();
        int M = scan.nextInt();
        scan.nextLine();
        int time = scan.nextInt();

        M += time;


        H += M / 60;
        M %= 60;

        H %= 24;

        System.out.println(H + " " + M);
    }
}
