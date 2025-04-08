import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];
        for(int i = 0; i<num ; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(arr);
        // 산술평균
        int total = 0;
        for(int k : arr){
            total+=k;
        }
        int avg = (int)Math.round((double)total / num);
        System.out.println(avg);
        // 중앙값
        System.out.println(arr[num/2]);
        // 최빈값
        HashMap<Integer, Integer> arrMap = new HashMap<>();
        for(int i : arr){
            arrMap.put(i, arrMap.getOrDefault(i,0) + 1);
        }
        int maxFreq = Collections.max(arrMap.values());
        List<Integer> modeList = new ArrayList<>();
        for(Map.Entry<Integer, Integer> entry : arrMap.entrySet()){
            if(entry.getValue() == maxFreq){
                modeList.add(entry.getKey());
            }
        }
        Collections.sort(modeList);
        int mode = (modeList.size()>=2) ? modeList.get(1) : modeList.get(0);
        System.out.println(mode);

        // 범위
        System.out.println(arr[num-1] - arr[0]);
    }
}
