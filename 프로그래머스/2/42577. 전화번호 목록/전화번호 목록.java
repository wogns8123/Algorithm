import java.util.HashMap;
class Solution {
    public boolean solution(String[] phone_book) {
        HashMap<String, Integer> map = new HashMap<>();
        for(int i = 0; i< phone_book.length; i++){
            map.put(phone_book[i], 1);
        }
        boolean check = true;
        for(String number : phone_book){
            for(int i = 1 ; i < number.length() ; i++){
                String prefix = number.substring(0,i);
                if(map.containsKey(prefix)){
                    check = false;
                }
            }
        }
        return check;
    }
}