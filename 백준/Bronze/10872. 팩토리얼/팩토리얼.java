import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int res = 1;
        for(int i = num;i>0;i--){
            res *= i;
        }
        System.out.println(res);
    }
}
