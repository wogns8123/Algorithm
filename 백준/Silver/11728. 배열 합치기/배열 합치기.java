import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int[] arrA = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arrB = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] arr = new int[A+B];

        int i = 0;
        int j = 0;
        int k = 0;
        while ( i< A && j < B){
            if (arrA[i] <= arrB[j]){
                arr[k++] = arrA[i++];

            } else {
                arr[k++] = arrB[j++];

            }
        }
        while(i<A){
            arr[k++] = arrA[i++];

        }
        while (j<B){
            arr[k++] = arrB[j++];

        }
        StringBuilder sb = new StringBuilder();

        for(int q : arr){
            sb.append(q).append(" ");
        }
        System.out.println(sb);

    }
}
