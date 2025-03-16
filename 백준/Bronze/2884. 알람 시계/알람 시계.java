import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int H = scan.nextInt();
        int M = scan.nextInt();

        // 분이 45보다 작을 때
        if (M < 45)  {
            if ( H == 0){
                H = 23;
                M += 15;
            } else {
                H -= 1;
                M += 15;
            }

        } else {
            M -= 45;
        }

        System.out.println(H +" " + M );

    }
}
