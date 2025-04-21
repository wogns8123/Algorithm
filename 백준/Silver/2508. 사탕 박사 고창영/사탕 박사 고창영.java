import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int testCase = Integer.parseInt(br.readLine());
        for(int i = 0; i< testCase; i++){
            br.readLine();
            StringTokenizer st = new StringTokenizer(br.readLine());
            int r = Integer.parseInt(st.nextToken());
            int c = Integer.parseInt(st.nextToken());
            String[][] arr = new String[r][c];
            int count = 0;
            // 배열 입력
            for(int j = 0; j<r; j++){
                arr[j] = br.readLine().split("");
            }


            // 가로 체크
            for(int q = 0; q<r ; q++){
                for(int p = 0; p<c-2 ; p ++){
                    if(arr[q][p].equals(">") && arr[q][p+1].equals("o") && arr[q][p+2].equals("<")){
                        count ++;
                    }
                }
            }
            // 세로 체크
            for(int p = 0; p < c; p++){
                for(int q = 0; q<r-2 ; q++){
                    if(arr[q][p].equals("v") && arr[q+1][p].equals("o") && arr[q+2][p].equals("^")){
                        count ++;
                    }
                }
            }
            System.out.println(count);
        }
    }
}
