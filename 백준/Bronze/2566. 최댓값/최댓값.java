import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[][] arr = new int[9][9];
        int maxNumber = 0;
        int resultI = 1;
        int resultJ = 1;
        for(int i = 0; i<9; i++){
            arr[i] = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            for(int j = 0 ; j< 9; j++){
                if (arr[i][j] > maxNumber){
                    maxNumber = arr[i][j];
                    resultI = i+1;
                    resultJ = j+1;
                }
            }
        }
        System.out.println(maxNumber);
        System.out.println(resultI +" "+ resultJ);
    }
}
