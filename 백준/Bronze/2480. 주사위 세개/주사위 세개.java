import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
//
//        int[] countArray = new int[7];
//        countArray[A]++;
//        int maxInArray = 0;
//        int indexInArray = 0;
//        for(int i = 0; i < countArray.length; i ++) {
//            countArray[A] += 1;
//            countArray[B] += 1;
//            countArray[C] += 1;
//        }
//        System.out.println(Arrays.toString(countArray));

        int prize = 0;
        if (a == b && b == c) {
            // 세 주사위의 눈이 모두 같을 때
            prize = 10000 + a * 1000;
        } else if (a == b || a == c) {
            // 두 개의 주사위의 눈이 같을 때 (a와 b, 또는 a와 c)
            prize = 1000 + a * 100;
        } else if (b == c) {
            // 두 개의 주사위의 눈이 같을 때 (b와 c)
            prize = 1000 + b * 100;
        } else {
            // 모든 주사위의 눈이 서로 다를 때
            int max = Math.max(a, Math.max(b, c));
            prize = max * 100;
        }

        System.out.println(prize);
    }
}
