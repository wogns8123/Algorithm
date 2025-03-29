import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> xMap = new HashMap<>();
        HashMap<Integer, Integer> yMap = new HashMap<>();
        for(int i = 0; i< 3; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            xMap.put(a, xMap.getOrDefault(a,0) + 1);
            yMap.put(b, yMap.getOrDefault(b,0) + 1);
        }
        int X = 0;
        int Y = 0;
        for(int key : xMap.keySet()){
            if(xMap.get(key) == 1){
                X = key;
            }
        }
        for(int key : yMap.keySet()){
            if(yMap.get(key) == 1){
                Y = key;
            }
        }
        System.out.println(X + " " + Y);

    }
}
