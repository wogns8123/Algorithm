import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int word = Integer.parseInt(br.readLine());
        String[] arr = new String[word];
        for(int i = 0; i< word; i++){
            arr[i] = br.readLine();
        }
        int lengthWord = arr[0].length();

        for(int q = 1; q<= lengthWord; q++){
            Set<String> check = new HashSet<>();
            for(int i = 0; i<word; i++){
                check.add(arr[i].substring(lengthWord-q));
            }
            if (check.size() == word){
                System.out.println(q);
                return;
            }
        }


    }
}
