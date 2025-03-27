import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int range = 2;
        int count = 1;
        if (number == 1){
            System.out.println(1);
        } else{
            while (range<=number){
                range = range + ( 6 * count );
                count ++;
            }
            System.out.println(count);
        }
    }
}
