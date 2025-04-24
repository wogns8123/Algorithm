import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long X = Long.parseLong(st.nextToken());
        long Y = Long.parseLong(st.nextToken());
        long now = (Y * 100) / X;
        if(now >= 99){
            System.out.println(-1);
            return;
        }
        long left = 1;
        long right = 1000000000;
        long count = 0;
        while(left<=right){
            long mid = (left + right) / 2;
            long result = (Y+mid) * 100 / (X+mid);

            if(result > now){
                count = mid;
                right = mid-1;
            } else{
                left = mid+1;
            }
        }
        System.out.println(count);
    }
}
