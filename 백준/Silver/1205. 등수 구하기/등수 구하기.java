import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] input = br.readLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int newScore = Integer.parseInt(input[1]);
        int P = Integer.parseInt(input[2]);

        if (N == 0) {
            System.out.println(1);
            return;
        }

        String[] scoreInput = br.readLine().split(" ");
        int[] arr = new int[N];
        for (int i = 0; i < N; i++) {
            arr[i] = Integer.parseInt(scoreInput[i]);
        }

        if (N == P && newScore <= arr[N - 1]) {
            System.out.println(-1);
        } else{
            int rank = 1;

            for (int i = 0; i < N; i++) {
                if (arr[i] > newScore) {
                    rank++;
                } else {
                    break;
                }
            }
            System.out.println(rank);

        }



    }
}
