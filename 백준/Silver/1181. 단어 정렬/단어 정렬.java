import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[] arr = new String[num];
        for(int i = 0 ; i<num;i++){
            arr[i] = br.readLine();
        }
        String[] result = Arrays.stream(arr).distinct().toArray(String[] :: new);

        Arrays.sort(result, (a,b) -> {
            if (a.length() != b.length()){
                return Integer.compare(a.length(), b.length());
            }
            return a.compareTo(b);
        });
        for(String k : result){
            System.out.println(k);
        }

    }
}
