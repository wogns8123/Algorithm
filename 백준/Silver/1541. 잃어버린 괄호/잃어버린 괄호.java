import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
    public static int a(String word){
        int res = 0;
        String[] wordArr = word.split("\\+");
        for(int i = 0; i< wordArr.length;i++){
            res += Integer.parseInt(wordArr[i]);
        }
        return res;

    }
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "-");
        List<String> arr = new ArrayList<>();
        // -가 몇개 인지 모르니 입력수만큼 처리하기 위해 ArrayList 사용
        while (st.hasMoreTokens()){
            arr.add(st.nextToken());
        }

        // +가 있으면 처리해서 다시 저장하자
        int[] res = new int[arr.size()];
        for(int i = 0; i< arr.size(); i++){
            if(arr.get(i).contains("+")){
                res[i] = a(arr.get(i));
            }else{
                res[i] = Integer.parseInt(arr.get(i));
            }
        }

        int result = res[0];
        for(int i = 1; i<res.length; i++){
            result -= res[i];
        }
        System.out.println(result);



    }
}
