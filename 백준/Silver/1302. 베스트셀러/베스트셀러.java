import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i<N;i++){
            String word = br.readLine();
            map.put(word, map.getOrDefault(word,0)+1);
        }
        List<Map.Entry<String, Integer>> entryList = new ArrayList<>(map.entrySet());

        entryList.sort((a,b) -> {
            if(!a.getValue().equals(b.getValue())){
                return b.getValue() - a.getValue();
            } else{
                return a.getKey().compareTo(b.getKey());
            }
        });

        System.out.println(entryList.get(0).getKey());
//        for(Map.Entry<String, Integer> entry: entryList){
//            System.out.println(entry.getKey()+ " " + entry.getValue());
//        }
//        System.out.println(map);
    }
}
