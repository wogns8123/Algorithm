import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        scan.nextLine();
        int count = 0;

        for (int i = 0; i < testCase; i++) {
            String word = scan.nextLine();
            boolean isGroupWord = true; // 그룹 단어 여부 확인

            // 이전 문자 저장 변수
            char prevChar = word.charAt(0);
            boolean[] visited = new boolean[26];  // 알파벳 방문 여부 체크

            // 첫 문자 이후부터 순차적으로 검사
            for (int j = 1; j < word.length(); j++) {
                char currentChar = word.charAt(j);

                // 이전 문자와 다르면
                if (prevChar != currentChar) {
                    // 현재 문자가 이미 이전에 나온 적이 있으면
                    if (visited[currentChar - 'a']) {
                        isGroupWord = false;  // 그룹 단어가 아님
                        break;
                    }
                    visited[prevChar - 'a'] = true;  // 이전 문자는 방문했다고 표시
                }
                prevChar = currentChar;  // 이전 문자 갱신
            }

            // 그룹 단어라면 count 증가
            if (isGroupWord) {
                count++;
            }
        }
        System.out.println(count);  // 그룹 단어의 개수 출력
    }
}
