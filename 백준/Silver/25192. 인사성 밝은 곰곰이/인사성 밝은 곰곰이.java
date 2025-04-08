import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        HashSet<String> setArr = new HashSet<>();

        int count = 0;
        for(int i = 0; i< num ; i++){
            String word = br.readLine();
            if(word.equals("ENTER")){
                count += setArr.size();
                setArr.clear();
            } else{
                setArr.add(word);

            }
        }
        count += setArr.size();
        System.out.println(count);

    }
}
