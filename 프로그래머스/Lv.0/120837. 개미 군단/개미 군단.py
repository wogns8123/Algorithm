def solution(hp):
    answer = 0
    cnt = 0
    while hp:
        if hp>=5:
            cnt += hp // 5
            hp %= 5
        if hp >= 3:
            cnt += hp // 3
            hp %= 3
        cnt += hp
        hp =0
    return cnt