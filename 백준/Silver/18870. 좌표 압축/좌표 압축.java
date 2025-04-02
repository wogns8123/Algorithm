import java.io.*;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        br.readLine();
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int[] result = arr.clone();
        Arrays.sort(result);
        Map<Integer, Integer> arrMap = new HashMap<>();
        int rank = 0;
        for(int n : result){
            if(!arrMap.containsKey(n)){
                arrMap.put(n, rank++);
            }
        }

        StringBuilder sb = new StringBuilder();
        for(int n : arr){
            sb.append(arrMap.get(n)).append(" ");
        }
        bw.write(sb.toString().trim());
        bw.flush();

    }
}
