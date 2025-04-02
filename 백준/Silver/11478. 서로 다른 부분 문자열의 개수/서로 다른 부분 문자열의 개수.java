import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String word = br.readLine();
        HashSet<String> wordSet = new HashSet<>();

        for (int i = 0; i<=word.length(); i++){
            for ( int j =i+1 ; j<= word.length(); j++){
                wordSet.add(word.substring(i,j));
            }
        }

        System.out.println(wordSet.size());


    }
}
