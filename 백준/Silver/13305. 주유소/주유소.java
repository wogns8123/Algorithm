import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] distance = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] price = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        long result = 0;
        int minPrice = price[0];
        for (int i = 0; i < distance.length; i++) {
            // 다음이 더 싸다면
            if (price[i] < minPrice) {
                minPrice = price[i];
            }
            result += (long)minPrice * distance[i];
        }
        System.out.println(result);

    }
}




