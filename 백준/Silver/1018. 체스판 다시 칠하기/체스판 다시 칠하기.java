import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());

        String[] arr = new String[n];
        for(int i = 0; i< n;i++){
            arr[i] = br.readLine();
        }
        int min_check1 = Integer.MAX_VALUE;
        int min_check2 = Integer.MAX_VALUE;

        for(int i = 0; i<=n-8; i++){
            for(int j =0; j<=m-8; j++){
                int check1 = 0;
                int check2 = 0;
                for(int p = 0; p< 8; p++){
                    for(int q = 0 ; q<8 ; q++){
                        if((p+q) % 2 == 0){
                            if (arr[p+i].charAt(q+j) != 'W'){
                                check1 += 1;
                            }
                            if (arr[i + p].charAt(j + q) != 'B') {
                                check2++;
                            }
                        } else{
                            if (arr[i+p].charAt(q+j) != 'B'){
                                check1 += 1;
                            }
                            if (arr[i + p].charAt(j + q) != 'W') {
                                check2++;
                            }
                        }
                    }
                }
                min_check1 = Math.min(min_check1, check1);
                min_check2 = Math.min(min_check2, check2);
            }
        }
        System.out.println(Math.min(min_check2,min_check1));

    }
}
