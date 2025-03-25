class Solution {
    public int solution(int[] schedules, int[][] timelogs, int startday) {
        int answer = schedules.length;

        for (int i = 0; i< schedules.length; i++){
            int limit_total = 60 * (schedules[i]/100) + schedules[i] % 100 +10;

            for (int j = 0; j<7; j++){
                if ((j+ startday)%7 > 0 && (j + startday)%7 < 6 &&
                limit_total < 60 * (timelogs[i][j]/100) + timelogs[i][j]%100){
                    answer--;
                    break;
                }
            }
        }
        
        return answer;
    }
}