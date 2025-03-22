import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int test = scan.nextInt();
        int[] arr = new int[test];
        int maxNumb = -1000000;
        int minNumb = 10000000;
        for (int i = 0; i < test; i ++){
            arr[i] = scan.nextInt();
        }
        for(int k: arr){
            if (k > maxNumb){
                maxNumb = k;
            }
            if (k < minNumb){
                minNumb = k;
            }
        }
        System.out.println(minNumb + " " + maxNumb);

    }
}
