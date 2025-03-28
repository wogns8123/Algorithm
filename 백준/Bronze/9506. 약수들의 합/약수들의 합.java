import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        while (scan.hasNext()){
            StringBuilder sb = new StringBuilder();
            int number = scan.nextInt();
            sb.append(number);

            if (number == -1){
                break;
            }
            scan.nextLine();
            List<Integer> arr = new ArrayList<>();
            int sum = 0;
            for(int i =1;i<number-1;i++){
                if (number%i == 0){
                    arr.add(i);
                }
            }

            for(int k : arr){
                sum += k;
            }

            if(number == sum){
                sb.append(" = ");
                for(int i : arr){
                    sb.append(i);
                    if (i != arr.get(arr.size()-1)){
                        sb.append(" + ");
                    }
                }
            } else {
                sb.append(" is NOT perfect.");
            }

            System.out.println(sb);
        }
    }
}
