import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int a = scan.nextInt();
        int b = scan.nextInt();
        int count = 0;
        List<Integer> arr = new ArrayList<>();
        for(int i =1; i<=a ; i++){
            if (a%i == 0){
                arr.add(i);
                count ++;
            }
            if (count == b){
                System.out.println(i);
                break;
            }
        }
        if(arr.size() < b){
            System.out.println(0);
        }



    }
}
