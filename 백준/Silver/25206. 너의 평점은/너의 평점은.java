import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double total = 0;
        int count = 0;
        double countTotal = 0;

        // 학점 테이블
        HashMap<String, Double> table = new HashMap<>();
        table.put("A+", 4.5);
        table.put("A0", 4.0);
        table.put("B+", 3.5);
        table.put("B0", 3.0);
        table.put("C+", 2.5);
        table.put("C0", 2.0);
        table.put("D+", 1.5);
        table.put("D0", 1.0);
        table.put("F", 0.0);

        for (int i = 0; i < 20; i++) {
            String word = scan.nextLine();
            String[] wordArr = word.split(" ");


            if (!wordArr[2].equals("P")) {
                double score = table.get(wordArr[2]) * Double.parseDouble(wordArr[1]);
                total += score;
                countTotal += Double.parseDouble(wordArr[1]);
            }
        }

        // 총 점수와 학점 수를 기반으로 평균 계산
        System.out.printf("%.6f", total / countTotal);
    }
}
