import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static boolean isPerfectSquare(int n ){
        if ( n < 0) return false;
        int root = (int)Math.sqrt(n);
        return root * root == n;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
        char[][] arr = new char[N][M];
        for(int i = 0; i<N;i++){
            arr[i] = br.readLine().toCharArray();
        }

        int max = -1;
        for(int i = 0; i<N; i++){
            for(int j = 0; j<M;j++){
                for(int p = -N; p<=N;p++){
                    for(int q = -M; q<=M;q++){
                        if(p == 0 && q == 0) continue;
                        int x = i;
                        int y = j;
                        StringBuilder sb = new StringBuilder();
                        while(x>=0 && y>= 0 && x<N && y<M){
                            sb.append(arr[x][y]);
                            int num = Integer.parseInt(sb.toString());
                            if(isPerfectSquare(num)){
                                max = Math.max(num, max);
                            }
                            x += p;
                            y += q;
                        }
                    }
                }
            }
        }
        System.out.println(max);

    }
}
