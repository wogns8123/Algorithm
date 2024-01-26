from collections import Counter

def solution(a,b,c,d):
    answer = 0
    cnt = Counter([a,b,c,d]).most_common(4)
    len_cnt = len(cnt)

    if len_cnt == 1:
        answer = 1111 * int(cnt[0][0])
    elif len_cnt == 2:
        if cnt[0][1] == 2:
            answer = (cnt[0][0] + cnt[1][0]) * abs(cnt[0][0] - cnt[1][0])
        else:
            answer = pow((10 * cnt[0][0] + cnt[1][0]),2)
    if len_cnt == 3:
        answer = cnt[1][0] * cnt[2][0]
    if len_cnt == 4:
        answer = min(a,b,c,d)
    return answer