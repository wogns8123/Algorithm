import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    static int min = Integer.MAX_VALUE;
    static int max = Integer.MIN_VALUE;
    static int[] arr;
    static int[] pmmd;
    public static void dfs(int index, int result){
        if (index == arr.length){
            min = Math.min(min, result);
            max = Math.max(max, result);
            return;
        }

        for(int i = 0; i<4; i++){
            if(pmmd[i] > 0){
                pmmd[i] --;
                switch (i){
                    case 0 : dfs(index+1, result + arr[index]); break;
                    case 1 : dfs(index+1, result - arr[index]); break;
                    case 2 : dfs(index +1, result * arr[index]); break;
                    case 3 : dfs(index + 1, result/ arr[index]); break;
                }
                pmmd[i] ++;
            }
        }
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        pmmd = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        dfs(1,arr[0]);
        System.out.println(max);
        System.out.println(min);

    }
}
