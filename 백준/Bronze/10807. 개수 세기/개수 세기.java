import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int N = scan.nextInt();
        int[] arr = new int[N];
        for (int i =0; i<N; i++){
            arr[i] = scan.nextInt();
        }
        int findNumb = scan.nextInt();

        int count = 0;
        for(int k: arr){
            if (k == findNumb){
                count +=1;
            }
        }

        System.out.println(count);


    }
}