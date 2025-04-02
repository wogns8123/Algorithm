import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class Main {
    public static int BinarySearch(int num, int[] nArr){
        int left = 0;
        int right = nArr.length-1;

        while(left <= right){
            int middle = (left + right)/2;
            int middleValue = nArr[middle];

            if(num> middleValue){
                left = middle + 1;
            } else if (num < middleValue){
                right = middle - 1;
            } else{
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] nArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(nArr);
        int M = Integer.parseInt(br.readLine());
        int[] mArr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        for(int i = 0; i<M ; i++){
            System.out.print(BinarySearch(mArr[i], nArr) + " ");
        }



    }
}
