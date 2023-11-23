def solution(numbers, n):
    rst = 0
    for i in numbers:
        rst += i
        if rst > n:
            break
    return rst