import java.util.TreeSet;
class Solution {
    public int[] solution(int[] numbers) {
        TreeSet<Integer> newArr = new TreeSet<>();
        for(int i = 0; i<numbers.length-1 ; i++){
            for(int j = i+1; j<numbers.length; j++){
                newArr.add(numbers[i]+numbers[j]);
            }
        }
        return newArr.stream().mapToInt(Integer::intValue).toArray();
    }
}