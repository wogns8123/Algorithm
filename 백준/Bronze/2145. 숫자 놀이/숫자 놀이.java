import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			int N = sc.nextInt();
			
			if(N == 0) {
				System.exit(0);
			} else {
				String num = String.valueOf(N);
				
				int result = oneLen(num);
				System.out.println(result);
			}
		}
	}
	
	public static int oneLen(String num) {
		int newN = 0;
		if(num.length() == 1) {
			return Integer.parseInt(num);
		} else {
			for(int i = 0; i < num.length(); i++) {
				newN += num.charAt(i) - '0';
				//Character.getNumericValue(num.charAt(i));
			}
			return oneLen(String.valueOf(newN));
		}
	}
	
}