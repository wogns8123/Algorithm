def solution(a, b):
    a = str(a)
    b = str(b)
    answer = max(int(a+b), int(b+a))
    return answer