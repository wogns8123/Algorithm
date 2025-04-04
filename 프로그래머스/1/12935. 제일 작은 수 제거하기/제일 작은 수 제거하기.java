class Solution {
    public int[] solution(int[] arr) {
        if (arr.length == 1){
            int[] answer = {-1};
            return answer;
        }
        
        int min = Integer.MAX_VALUE;
        int[] newArr = new int[arr.length-1];
        int index = 0;
        for(int i = 0 ; i< arr.length;i++){
            if (arr[i] < min){
                min = arr[i];
            }
        }

        for (int num : arr) {
            if (num != min) {  
                newArr[index++] = num;  // ✅ 올바르게 값 추가
            }
        }

        return newArr;
    }
}