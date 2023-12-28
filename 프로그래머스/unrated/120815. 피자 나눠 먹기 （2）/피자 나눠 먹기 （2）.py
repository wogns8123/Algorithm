import math
def solution(n):
    rst = (n * 6) // math.gcd(n, 6) // 6
    return rst