import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int num = scan.nextInt();
        int check = 0;

        while(num>=0){
            if(num%5 == 0){
                check += num/5;
                num %= 5;
                break;
            }
            num -= 3;
            check+=1;
        }
        if(num<0){
            System.out.println(-1);
        } else{
            System.out.println(check);

        }

    }
}
