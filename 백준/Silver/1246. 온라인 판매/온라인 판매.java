import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int egg = Integer.parseInt(st.nextToken());
        int person = Integer.parseInt(st.nextToken());
        int[] cost = new int[person];
        for(int i = 0; i< person; i++){
            cost[i] = Integer.parseInt(br.readLine());
        }
        Arrays.sort(cost);

        int maxProfit = 0;
        int resultPrice = 0;

        for (int i = 0; i < person; i++) {
            int price = cost[i];
            int buyers = person - i; // 이 가격 이상 지불 가능한 사람 수
            int sellCount = Math.min(buyers, egg);
            int profit = price * sellCount;

            if (profit > maxProfit) {
                maxProfit = profit;
                resultPrice = price;
            }
        }
        System.out.println(resultPrice + " " + maxProfit);

    }
}
