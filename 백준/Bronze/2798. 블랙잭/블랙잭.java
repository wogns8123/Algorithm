import java.util.Arrays;
import java.util.Scanner;

import static java.lang.Math.max;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int goal = scan.nextInt();
        scan.nextLine();
        int[] arr = Arrays.stream(scan.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int maxgoal = 0;
        for(int i = 0 ; i<number-2;i++){
            for(int j =i+1 ; j<number-1;j++){
                for(int k = j+1; k<number;k++){
                    int sum = arr[i] + arr[j] + arr[k];
                    if (sum <= goal){
                        maxgoal = max(maxgoal, sum);
                    }
                }
            }
        }
        System.out.println(maxgoal);
    }
}
