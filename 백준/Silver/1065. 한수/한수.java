import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static boolean isHanSu(int num){
        if (num<100){
            return true;
        }
        int a = num/100;
        int b = (num/10)%10;
        int c = num%10;
        return (a-b) == (b-c);
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine());
        int count = 0;
        for(int i = 1; i<= num; i++){
            if (isHanSu(i)){
                count++;
            }
        }
        System.out.println(count);
    }
}
