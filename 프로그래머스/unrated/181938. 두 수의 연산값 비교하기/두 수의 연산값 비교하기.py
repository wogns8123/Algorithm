def solution(a, b):
    answer = 0
    check1 = int(str(a)+str(b))
    check2 = 2 * a * b
    if check1 >= check2:
        return check1
    else:
        return check2