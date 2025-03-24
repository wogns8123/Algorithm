import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();

        for(int i =1; i<=number;i++){
            for(int j=0; j<number-i; j++){
                System.out.print(" ");
            }
            for (int k = 0; k<2*i-1; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i = number-1; i>=1; i--){
            for(int j=0; j< number -i ; j++){
                System.out.print(" ");
            }
            for (int k = 0; k< 2 * i -1; k++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
