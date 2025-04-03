import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static int BinarySearch(int n, int[] Narr){
        int start = 0;
        int end = Narr.length-1;

        while(start<=end){
            int middle = (start + end) /2;
            int middleValue = Narr[middle];

            if(n > middleValue){
                start = middle + 1;
            } else if (n < middleValue){
                end = middle - 1;
            } else {
                return 1;
            }
        }
        return 0;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] Narr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        Arrays.sort(Narr);
        int M = Integer.parseInt(br.readLine());
        int[] Marr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        for(int i = 0; i< M ; i++){
            System.out.println(BinarySearch(Marr[i], Narr));
        }



    }
}
