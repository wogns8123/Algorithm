import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int number = scan.nextInt();

        for (int i =0; i < number/4 ; i ++){
            System.out.print("long ");
        }
        System.out.println("int");
    }
}
