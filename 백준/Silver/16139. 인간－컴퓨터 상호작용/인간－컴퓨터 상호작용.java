import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] word = br.readLine().split("");

        int q = Integer.parseInt(br.readLine());
        for(int i = 0; i<q;i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            String find = st.nextToken();

            int count = 0;
            int start = Integer.parseInt(st.nextToken());
            int end = Integer.parseInt(st.nextToken());
            for(int j = start ; j<=end; j++){
                if (word[j].equals(find)){
                    count ++;
                }
            }

            System.out.println(count);
        }

    }
}
