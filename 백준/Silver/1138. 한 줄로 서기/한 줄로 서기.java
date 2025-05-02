import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] arr = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] result = new int[N];

        for(int i = 0; i < N; i++){
            int spcae = 0;
            int person = i+1;
            int taller = arr[i];
            for(int j = 0 ; j<N;j++){
                if(result[j] == 0){
                    if(spcae == taller){
                        result[j] = person;
                        break;
                    }
                    spcae++;
                }
            }
        }
        for(int k:result){
            System.out.print(k + " ");
        }
    }
}
