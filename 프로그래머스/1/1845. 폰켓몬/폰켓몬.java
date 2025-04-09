import java.util.HashMap;
class Solution {
    public int solution(int[] nums) {
        int answer = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i< nums.length; i++){
            map.put(nums[i], map.getOrDefault(nums[i], 0) +1);
        }
        int n = nums.length/2;
        int result =(Math.min(n, map.size()));
        return result;
    }
}