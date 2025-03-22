import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[42];
        int count = 0;
        for(int i = 0; i < 10; i++){
            int student = scan.nextInt();
            arr[student%42] += 1;
        }
        for(int k:arr){
            if(k!=0){
                count += 1;
            }
        }
        System.out.println(count);
    }
}
