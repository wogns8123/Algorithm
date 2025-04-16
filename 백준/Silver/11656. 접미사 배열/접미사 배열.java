import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        String[] wordList = new String[word.length()];
        for(int i = 0; i<wordList.length; i++){
            wordList[i] = word.substring(i);
        }
        Arrays.sort(wordList);
        for(String k:wordList){
            System.out.println(k);
        }
    }
}
