import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static boolean isLeap(int year){
        return (year%4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    public static int getTotalDay(int year, int month, int day){
        int[] daysInMonth = {31,28,31,30,31,30,31,31,30,31,30,31};
        int total = 0;

        for(int y = 1; y < year; y++){
            total += isLeap(y) ? 366 : 365;
        }
        for(int m = 1; m<month;m++){
            if(m == 2 && isLeap(year)){
                total += 29;
            } else{
                total += daysInMonth[m-1];
            }
        }
        total+= day;
        return total;
    }
    public static int countLeapYear(int startYear, int endYear){
        int count = 0;
        for(int i = startYear; i<=endYear; i++){
            if((i%4 == 0 && i % 100 != 0) || (i%400 == 0)){
                count += 1;
            }
        }
        return count;
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int[] start = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();
        int[] end = Arrays.stream(br.readLine().split(" ")).mapToInt(Integer::parseInt).toArray();

        int startDay = getTotalDay(start[0], start[1], start[2]);
        int endDay = getTotalDay(end[0], end[1], end[2]);
        int result = endDay-startDay;
        if (result >= (365 * 1000 + countLeapYear(start[0], end[0]))){
            System.out.println("gg");
        } else{
            System.out.printf("D-%d",result);
        }

    }
}
