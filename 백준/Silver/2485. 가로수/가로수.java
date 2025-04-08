import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num];
        int[] arr_check = new int[num-1];
        for(int i = 0; i< num; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }
        for(int i = 0;i<num-1; i++){
            arr_check[i] = arr[i+1] - arr[i];
        }
        long lcm = arr_check[0];
        for(int i = 1; i<arr_check.length; i++){
            lcm = gcd(lcm, arr_check[i]);
        }
        int count = 0;
        for(int i = 0; i < arr_check.length; i++){
            count += arr_check[i] / lcm -1;
        }
        System.out.println(count);

    }
    public static long gcd(long a, long b){
        if (b==0) return a;
        return gcd(b, a%b);

    }
}
