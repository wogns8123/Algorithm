import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        int numCheck = 666;
        int count = 1;
        while (count<num){
            numCheck+=1;
            if(String.valueOf(numCheck).contains("666")){
                count++;
            }
        }
        System.out.println(numCheck);

    }
}
