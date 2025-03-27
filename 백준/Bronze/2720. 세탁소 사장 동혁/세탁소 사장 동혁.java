import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int testCase = scan.nextInt();
        for (int i = 0; i<testCase; i++){
            int number = scan.nextInt();
            int[] arr = new int[4];
            while (number>0){
                if (number >= 25) {
                    int remainder = number / 25;
                    number %= 25;
                    arr[0] = remainder;
                }
                if (number>=10) {
                    int remainder = number / 10;
                    number %= 10;
                    arr[1] = remainder;
                }
                if (number>=5) {
                    int remainder = number / 5;
                    number %= 5;
                    arr[2] = remainder;
                }
                if (number>=1) {
                    int remainder = number / 1;
                    number %= 1;
                    arr[3] = remainder;
                }
            }
            for(int k:arr){
                System.out.print(k+" ");
            }
            System.out.println();
        }
    }
}
