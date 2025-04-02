import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        String[][] arr = new String[num][2];
        for(int i = 0; i<num; i++){
            arr[i] = Arrays.stream(br.readLine().split(" ")).toArray(String[] :: new);
        }

        Arrays.sort(arr, Comparator.comparingInt(a -> Integer.parseInt(a[0])));

        for(String[] result : arr){
            System.out.println(result[0] + " " + result[1]);
        }

    }
}
