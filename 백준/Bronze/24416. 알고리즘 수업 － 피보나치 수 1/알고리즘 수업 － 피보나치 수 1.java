import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    static int count1 = 0;
    static int count2 = 0;
    public static int fib(int n){
        if(n == 1 || n == 2){
            count1 ++;
            return 1;
        } else{
            return (fib(n-1)+fib(n-2));
        }
    }
    public static int[] fibonacci(int[] arr){
        arr[1] = 1;
        arr[2] = 1;
        for(int i = 3; i< arr.length;i++){
            count2++;
            arr[i] = arr[i-1] + arr[i-2];
        }
        return arr;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int[] arr = new int[num+1];
        fib(num);
        fibonacci(arr);
        System.out.println(count1 + " " + count2);
    }
}
