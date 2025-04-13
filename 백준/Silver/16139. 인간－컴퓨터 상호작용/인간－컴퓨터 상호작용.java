import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String S = br.readLine();
        int len = S.length();
        int[][] prefix = new int[26][len];


        for (int i = 0; i < len; i++) {
            for (int j = 0; j < 26; j++) {
                if (i == 0) prefix[j][i] = 0;
                else prefix[j][i] = prefix[j][i - 1];
            }
            prefix[S.charAt(i) - 'a'][i]++;
        }



        int q = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i<q;i++){
            String[] input = br.readLine().split(" ");
            char c = input[0].charAt(0);
            int l = Integer.parseInt(input[1]);
            int r = Integer.parseInt(input[2]);
            int count = 0;

            if ( l == 0){
                count = prefix[c-'a'][r];
            }
            else{
                count = prefix[c-'a'][r] - prefix[c-'a'][l-1];
            }
            sb.append(count).append("\n");
        }
        System.out.println(sb.toString());


    }
}
