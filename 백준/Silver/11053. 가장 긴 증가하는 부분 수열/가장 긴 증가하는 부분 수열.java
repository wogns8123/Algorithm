import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        ArrayList<Integer> dp = new ArrayList<>();
        for(int i = 0; i< num; i++){
            int now = arr[i];
            if(dp.isEmpty() || dp.get(dp.size()-1) < now){
                dp.add(now);
            } else{
                int left = 0;
                int right = dp.size()-1;

                while(left<right){
                    int mid = (left + right) / 2;
                    if(dp.get(mid) < now){
                        left = mid+1;
                    } else{
                        right = mid;
                    }
                }
                dp.set(left,now);
            }
        }
        System.out.println(dp.size());
    }
}
