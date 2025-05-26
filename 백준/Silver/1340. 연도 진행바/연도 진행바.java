import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static int[] getYear(int year){
        int[] monthDay = {0, 31,28,31,30,31,30,31,31,30,31,30,31};
        if ((year % 400 == 0) || ((year % 4 == 0) && (year%100 != 0))){
            monthDay[2] = 29;
        }
        return monthDay;
    }
    public static int getMonth(String month){
        int result = 0;
        if(month.equals("January")) result = 1;
        else if (month.equals("February")) result = 2;
        else if (month.equals("March")) result = 3;
        else if (month.equals("April")) result = 4;
        else if (month.equals("May")) result = 5;
        else if (month.equals("June")) result = 6;
        else if (month.equals("July")) result = 7;
        else if (month.equals("August")) result = 8;
        else if (month.equals("September")) result = 9;
        else if (month.equals("October")) result = 10;
        else if (month.equals("November")) result = 11;
        else if (month.equals("December")) result = 12;

        return result;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] time = br.readLine().split(" ");

        int month = getMonth(time[0]);
        int day = Integer.parseInt(time[1].replace(",", ""));

        // 윤년 확인 및 월 체크
        int[] monthArr = getYear(Integer.parseInt(time[2]));
        int totalYearMinutes = Arrays.stream(monthArr).sum() * 1440;

        String[] splitTime = time[3].split(":");
        int hour = Integer.parseInt(splitTime[0]);
        int minute = Integer.parseInt(splitTime[1]);

        // 총 일 수 합하기
        int sum_date = 0;
        for(int i = 1; i<month;i++){
            sum_date += monthArr[i];
        }
        sum_date+= day-1;

        // 총 일수 분으로 변환
        sum_date = sum_date * 1440;

        // 시간을 분으로 변환
        int sum_hour = hour * 60;

        // 총 결과
        int sum = sum_date + sum_hour + minute;

//        double result = (double) sum / totalYearMinutes *100;
        System.out.printf("%.9f\n", (double) sum / totalYearMinutes *100);

    }
}
