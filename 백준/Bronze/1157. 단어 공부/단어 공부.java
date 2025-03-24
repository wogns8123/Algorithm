import javax.swing.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String word = scan.nextLine();
        char[] wordArr = word.toUpperCase().toCharArray();
        HashMap<Character, Integer> wordCount = new HashMap();

        for (char i: wordArr){
            wordCount.put(i, wordCount.getOrDefault(i, 0) + 1);
        }

        int max = Collections.max(wordCount.values());
        int cnt = 0;
        char ch = '?';

        for (Map.Entry<Character, Integer> tmpMap : wordCount.entrySet()) {
            if (tmpMap.getValue() == max) {  // value 값이 max와 같으면
                cnt++;
                ch = tmpMap.getKey();  // 해당 key를 ch에 저장
            }
        }
        if(cnt > 1){
            System.out.println("?");
        } else{
            System.out.println(ch);
        }


    }
}
