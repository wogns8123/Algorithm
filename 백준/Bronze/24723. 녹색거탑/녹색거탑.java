import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int result = 1;
        for(int i = 0; i<num;i++){
            result *= 2;
        }
        System.out.println(result);

    }
}
