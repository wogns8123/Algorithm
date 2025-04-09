import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Map;

public class Main {
    static int[][] arr;
    static int N;
    static boolean[] choiced;
    static int min = Integer.MAX_VALUE;
    public static void dfs(int depth, int person){

        if (depth == N/2){
            min = Math.min(min, calculatedDiff());
            return;
        }

        for(int i = person; i<N ; i++){
            if(!choiced[i]){
                choiced[i] = true;
                dfs(depth+1, i+1);
                choiced[i] = false;
            }
        }
    }

    public static int calculatedDiff(){
        int startTeam = 0;
        int linkTeam = 0;

        for(int i = 0; i<N-1; i++){
            for(int j = i+1; j<N; j++){
                if(choiced[i] &&choiced[j]){
                    startTeam += arr[i][j] + arr[j][i];
                } else if(!choiced[i] && !choiced[j]){
                    linkTeam += arr[i][j] + arr[j][i];
                }
            }
        }
        return Math.abs(startTeam - linkTeam);

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        N = Integer.parseInt(br.readLine());
        arr = new int[N][N];
        for(int i = 0; i< N; i++){
            arr[i] = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        }
        choiced = new boolean[N];
        dfs(0,0);
        System.out.println(min);
    }
}
