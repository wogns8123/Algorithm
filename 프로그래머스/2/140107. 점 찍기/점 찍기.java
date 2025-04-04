class Solution {
    public long solution(int k, int d) {
        long answer = 0;
        for(int x = 0; x <= d; x += k){
            answer += (int)Math.sqrt(1.0 * d * d - 1.0 * x * x) / k + 1  ;
        }
        return answer;
    }
}