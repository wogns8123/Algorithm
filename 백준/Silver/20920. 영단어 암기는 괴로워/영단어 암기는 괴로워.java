import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        HashMap<String, Integer> wordMap = new HashMap<>();

        for(int i = 0; i< N; i++){
            String word = br.readLine();
            if (word.length() >= M){
                wordMap.put(word, wordMap.getOrDefault(word, 0) + 1);
            }
        }

        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(wordMap.entrySet());
        entryList.sort((e1,e2) -> {
            if (!e1.getValue().equals(e2.getValue())) {
                return e2.getValue() - e1.getValue();
            } else if (e1.getKey().length() != e2.getKey().length()) {
                return e2.getKey().length() - e1.getKey().length();
            } else {
                return e1.getKey().compareTo(e2.getKey());
            }
        });

        StringBuilder sb = new StringBuilder();
        for(Map.Entry<String,Integer> entry : entryList){
            sb.append(entry.getKey()).append("\n");
        }
        System.out.println(sb.toString());

    }
}
