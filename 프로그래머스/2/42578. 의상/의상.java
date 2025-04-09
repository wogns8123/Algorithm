import java.util.HashMap;
class Solution {
    public int solution(String[][] clothes) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i< clothes.length; i++){
            map.put(clothes[i][1], map.getOrDefault(clothes[i][1], 0) + 1);
        }
        int count = 1;
        for(int k : map.values()){
            count*=(k+1);
        }
        count -= 1;
        return count;
    }
}