import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        HashSet<Integer> check = new HashSet<>();
        for (int i = 0 ; i<10;i++){
            int number = scan.nextInt();
            check.add(number%42);
        }
        System.out.println(check.size());
    }
}
