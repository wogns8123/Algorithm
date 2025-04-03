public class Main {
    public static int d(int n){
        int sum = n;
        while (n > 0){
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = new int[10001];

        for(int i = 1; i < 10001; i++) {
            int x = d(i);
            if (x <= 10000) {
                arr[x] = 1;
            }
        }
        for(int i = 1; i<=10000; i++){
            if(arr[i] == 0){
                System.out.println(i);
            }
        }
    }
}
