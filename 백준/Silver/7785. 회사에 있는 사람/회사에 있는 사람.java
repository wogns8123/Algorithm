import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        HashMap<String, String> personCheck = new HashMap<String, String>();
        List<String> names = new ArrayList<>();
        for(int i = 0; i< num;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String key = st.nextToken();
            String value = st.nextToken();
            if(value.equals("enter")) {
                personCheck.put(key, value);
            } else{
                personCheck.remove(key);
            }
        }
        names.addAll(personCheck.keySet());
        names.sort(Collections.reverseOrder());
        for(String name : names){
            System.out.println(name);
        }

    }
}
