import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] arr = new int[9];
        int total = 0;
        for(int i = 0 ;i<9;i++){
            int height = Integer.parseInt(br.readLine());
            total += height;
            arr[i] = height;
        }
        int target = total - 100;
        ArrayList<Integer> result = new ArrayList<>();
        int remove1 = 0;
        int remove2 = 0;
        for(int i = 0; i< 8;i++){
            for(int j = i+1; j<9;j++){
                if(arr[i] + arr[j] == target){
                    remove1 = i;
                    remove2 = j;
                }
            }
        }
        for(int i = 0; i< 9;i++){
            if(i == remove1 || i == remove2){
                continue;
            }
            result.add(arr[i]);
        }
        Collections.sort(result);
        for(int k : result){
            System.out.println(k);
        }
    }
}
