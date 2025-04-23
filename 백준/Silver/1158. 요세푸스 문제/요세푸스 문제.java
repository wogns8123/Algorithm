import javax.swing.plaf.basic.BasicButtonUI;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =1;i<=N; i++){
            arr.add(i);
        }
        ArrayList<Integer> result = new ArrayList<>();
        int index = 0;
        while(!arr.isEmpty()){
            index = (index + K - 1) % arr.size();
            result.add(arr.remove(index));
        }
        System.out.print("<");
        for(int i = 0; i < result.size(); i++){
            System.out.print(result.get(i));
            if(i!= result.size()-1){
                System.out.print(", ");
            }
        }
        System.out.print(">");
    }
}
