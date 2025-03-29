import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        for (int i = 0 ; i< testCase; i++){
            int a = scan.nextInt();
            int b = scan.nextInt();
            int num = 1;
            for(int j =0; j < b; j++){
                num = (num * a) % 10;
            }

            if(num == 0){
                System.out.println(10);
            } else{
                System.out.println(num);
            }
        }
    }
}
