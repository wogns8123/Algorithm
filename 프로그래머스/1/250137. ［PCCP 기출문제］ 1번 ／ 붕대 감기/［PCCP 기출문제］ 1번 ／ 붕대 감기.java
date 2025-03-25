class Solution {
    public int solution(int[] bandage, int health, int[][] attacks) {
        int second = 0;
        int max_second = 0;
        for(int i = 0; i < attacks.length; i++){
            if(max_second < attacks[i][0]){
                max_second = attacks[i][0];
            }
        }
        int nowHealth = health;
        int count = 0;
        int attackLine = 0;
        for(int i = 0; i<max_second+1;i++){
            // 공격
            if (attackLine < attacks.length && i == attacks[attackLine][0]){
                nowHealth -= attacks[attackLine][1];
                attackLine+=1;
                count = 0;
                continue;
            }
            // 자동회복
            if (nowHealth < health){
                nowHealth+=bandage[1];
                if (nowHealth > health) {
                    nowHealth = health;
                }
                count ++;
            }
            // 회복스킬 시전
            if (count == bandage[0] ){
                nowHealth+= bandage[2];
                count = 0;
                if (nowHealth > health) {
                    nowHealth = health;
                }
            }
            second ++;
            if (nowHealth <= 0){
                break;
            }
        }


        if (nowHealth <=0 ){
            return -1;
        } else{
            return nowHealth;
        }
    }
}