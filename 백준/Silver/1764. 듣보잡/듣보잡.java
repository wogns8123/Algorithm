import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());
       HashSet<String> Nset = new HashSet<>();
       List<String> resultList = new ArrayList<>();
       for(int i =0 ; i<N;i++){
           Nset.add(br.readLine());
       }
       for(int j =0;j<M;j++){
           String name = br.readLine();
           if(Nset.contains(name)){
               resultList.add(name);
           }
       }

        Collections.sort(resultList);
        System.out.println(resultList.size());
        for(String n : resultList){
            System.out.println(n);
        }
    }
}
