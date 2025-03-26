import java.util.Arrays;
import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String[][] arr = new String[5][15];
        for(int i = 0; i<5; i++){
            String input = scan.nextLine();
            for(int j = 0 ; j< input.length(); j++){
                arr[i][j] = String.valueOf(input.charAt(j));
            }
        }
        for(int j = 0; j < arr[0].length; j++){
            for(int i = 0; i< arr.length; i++){
                if (arr[i][j] != null){
                    System.out.print(arr[i][j]);
                }
            }

        }
    }
}
