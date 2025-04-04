import java.util.Arrays;

class Solution {
    public int solution(int[] d, int budget) {
        Arrays.sort(d);
        int sum = 0;
        int count = 0;
        for(int k : d){
            if(sum+k > budget){
                break;
            }
            sum += k;
            count ++;
        }
        return count;
    }
}