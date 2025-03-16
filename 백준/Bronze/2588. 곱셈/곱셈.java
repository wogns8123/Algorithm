import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String num1 = br.readLine();
        String num2 = br.readLine();
        int changeNum1 = Integer.parseInt(num1);

        int changeNum2 = Integer.parseInt(num2);


        System.out.println(changeNum1*Integer.parseInt(Character.toString(num2.charAt(2))));
        System.out.println(changeNum1*Integer.parseInt(Character.toString(num2.charAt(1))));
        System.out.println(changeNum1*Integer.parseInt(Character.toString(num2.charAt(0))));
        System.out.println(changeNum1 * changeNum2);

    }
}
