import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int testCase = scan.nextInt();
        double[] arr = new double[testCase];

        // 배열 생성
        for(int i = 0; i< testCase; i++){
            arr[i] = scan.nextInt();
        }
        // 최댓값 구하기
        int maxNumber = 0;
        for(double k : arr){
            if ((int)k > maxNumber){
                maxNumber = (int)k;
            }

        }
        // /M * 100 으로 배열 수정
        for (int i = 0; i<testCase; i++){
            arr[i] = arr[i]/maxNumber*100;
        }
        
        double total = 0;
        for (double k : arr){
            total += k;
        }


        // 평균 계산
        System.out.println(total/testCase);


    }
}
