import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int maxNum = -1000000;
        int minNum = 1000000;

        while (st.hasMoreTokens()){
            int val = Integer.parseInt(st.nextToken());
            if (val > maxNum){
                maxNum = val;
            }
            if (val < minNum){
                minNum = val;
            }
        }
        System.out.println(minNum + " " + maxNum);
    }
}
