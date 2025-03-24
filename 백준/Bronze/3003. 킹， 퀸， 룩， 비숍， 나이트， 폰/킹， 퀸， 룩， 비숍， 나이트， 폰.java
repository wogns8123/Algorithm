import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = {1,1,2,2,2,8};

        String[] input = scan.nextLine().split(" ");

        int[] inputArr = new int[input.length];
        for(int i = 0; i<input.length; i++){
            inputArr[i] = Integer.parseInt(input[i]);
            if(inputArr[i] == arr[i]){
                System.out.print(0 + " ");
            } else {
                System.out.print(arr[i] - inputArr[i] + " ");
            }
        }




    }
}
