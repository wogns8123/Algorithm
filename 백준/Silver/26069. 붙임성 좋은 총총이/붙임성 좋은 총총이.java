import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.StringReader;
import java.util.HashSet;
import java.util.Set;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());

        HashSet<String> arrSet = new HashSet<>();
        arrSet.add("ChongChong");
        for(int i = 0; i<num; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            String b = st.nextToken();

            if(arrSet.contains(a) || arrSet.contains(b)){
                arrSet.add(a);
                arrSet.add(b);
            }
        }
        System.out.println(arrSet.size());
    }
}
