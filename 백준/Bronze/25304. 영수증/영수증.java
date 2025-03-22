import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int total_price = scan.nextInt();
        int total_number = scan.nextInt();
        int[] arr = new int[total_number];

        for (int i = 0; i< total_number; i++){
            int price = scan.nextInt();
            int number = scan.nextInt();
            arr[i] = price * number;
        }
        int total_price_check = 0;
        for (int k : arr){
            total_price_check += k;
        }
        if (total_price_check == total_price){
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

    }
}
