class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        long value = x;
        for(int i = 0; i<n; i++){
            answer[i] = value * (i+1);
        }
        return answer;
    }
}