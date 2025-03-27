import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number = scan.nextInt();
        int count = 1; // 칸의 개수
        int sum = 0;    // 칸 더한 수
        while (true){
            if(number <= count + sum){
                if(count % 2 == 1){
                    System.out.println((count - (number-sum-1)) + "/" + (number-sum));
                    break;
                } else{
                    System.out.println((number-sum) + "/" + (count - (number-sum-1)));
                    break;
                }
            } else{
                sum += count;
                count++;
            }
        }



    }
}
