def solution(s):
    cnt = 0

    check_1 = 0
    check_2 = 0

    for i in s:
        if check_1 == check_2:
            cnt += 1
            k = i
        if k == i:
            check_1 += 1
        else:
            check_2 += 1


    return cnt