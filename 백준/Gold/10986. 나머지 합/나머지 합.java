import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        long[] S = new long[N+1];
        long[] rest = new long[M];
        long answer = 0;
        
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        for(int i = 1; i<N+1; i++){
            S[i] = (S[i-1] + Integer.parseInt(st2.nextToken())) % M;
            // 0~i까지 합을 M으로 나눈 나머지가 0인 경우의 수
            if(S[i] == 0){
                answer ++;
            }
            // 나머지가 같은 인덱스의 수
            rest[(int)S[i]]++;
        }
        for(int i = 0;i<M; i++){
            if(rest[i] > 0){
                answer += rest[i] * (rest[i] - 1) / 2;
            }
        }
        System.out.println(answer);


    }
}
