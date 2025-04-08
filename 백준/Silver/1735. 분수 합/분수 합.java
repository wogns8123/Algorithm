import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        long A = Integer.parseInt(st.nextToken());
        long B = Integer.parseInt(st.nextToken());
        long C = Integer.parseInt(st2.nextToken());
        long D = Integer.parseInt(st2.nextToken());
        long lcm = B*D / GCD(B,D);
        long check = lcm/B;
        long check2 = lcm/D;

        //기약분수 만들기
        long rest = (A * check + C * check2);
        long finalGCD = GCD(rest,lcm);
        rest /= finalGCD;
        lcm /= finalGCD;
        
        System.out.println(rest + " " + lcm);

    }
    public static long GCD(long a, long b){
        if (b == 0) return a;
        return GCD(b, a%b);
    }
}
