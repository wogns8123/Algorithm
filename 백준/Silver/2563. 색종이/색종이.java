import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[100][100];
        int paper = scan.nextInt();
        for(int i = 0; i< paper; i++){
            int x = scan.nextInt();
            int y = scan.nextInt();

            for(int q = x; q < x+10; q++){
                for(int w = y; w < y+10; w++){
                    arr[q][w] = 1;
                }
            }
        }
        int count = 0;
        for(int[] row : arr){
            for(int value : row){
                if (value == 1){
                    count += 1;
                }
            }
        }
        System.out.println(count);
    }
}
