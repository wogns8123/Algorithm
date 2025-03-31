import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();

        for(int i = 1; i< num ; i++){
            String checkNum = String.valueOf(i);
            int add_number = i;
            // 분해합
            for(int j = 0; j<checkNum.length(); j++){
                add_number += checkNum.charAt(j) - '0';
            }
            if (add_number == num){
                System.out.println(i);
                return;
            }

        }
        System.out.println(0);



    }
}
