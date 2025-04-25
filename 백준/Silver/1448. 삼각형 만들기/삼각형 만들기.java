import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i = 0; i < N; i++){
            arr.add(Integer.parseInt(br.readLine()));
        }
        Collections.sort(arr, Collections.reverseOrder());
        int max = -1;
        for(int i = 0; i< arr.size()-2; i++){
            if(arr.get(i) < arr.get(i+1) + arr.get(i+2)){
                max = arr.get(i) + arr.get(i+1) + arr.get(i+2);
                break;
            }
        }
        System.out.println(max);
    }
}
