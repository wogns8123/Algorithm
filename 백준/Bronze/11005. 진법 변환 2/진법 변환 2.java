import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int check = scan.nextInt();
        scan.nextLine();
        List<Character> result = new ArrayList<>();
        while (number >0){
            int remainder = number%check;

            if(remainder<10){
                result.add((char)('0' + remainder));
            } else {
                result.add((char)('A' + (remainder-10)));
            }
            number /= check;
        }
        for (int i = result.size()-1; i>=0; i--){
            System.out.print(result.get(i));
        }
    }
}
