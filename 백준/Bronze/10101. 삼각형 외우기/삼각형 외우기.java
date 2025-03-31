import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int total = a+b+c;

        if (total != 180){
            System.out.println("Error");
        } else{
            if (a == 60 && b == 60 && c == 60){
                System.out.println("Equilateral");
            } else if (a == b || a==c || b == c){
                System.out.println("Isosceles");
            } else{
                System.out.println("Scalene");
            }
        }

    }
}
