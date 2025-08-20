import java.util.Scanner;

public class Main {
        public static void main(String[] args) {
                Scanner sc = new Scanner(System.in);
                int t = sc.nextInt(); // 테스트 데이터의 수

                for (int i = 0; i < t; i++) {
                        String s = sc.next(); // 문자열 입력
                        int sum = 0;
                        boolean[] alphabets = new boolean[26]; // 알파벳이 등장했는지 여부를 저장하는 배열

                        // 입력된 문자열을 순회하며 알파벳 등장 여부를 체크한다
                        for (int j = 0; j < s.length(); j++) {
                                int index = s.charAt(j) - 'A';
                                alphabets[index] = true;
                        }

                        // 등장하지 않은 알파벳의 아스키 코드 값을 합산한다
                        for (int j = 0; j < 26; j++) {
                                if (!alphabets[j]) {
                                        sum += (j + 'A');
                                }
                        }
                        System.out.println(sum);
                }
                sc.close();
        }
}