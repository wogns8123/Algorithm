import math


def primenumber(x):
    if x == 1:
        return False
    for i in range(2, int(math.sqrt(x)) + 1):
        if x % i == 0:
            return False
    return True


def palin(x):
    x = str(x)
    x_ch = x[::-1]
    if x == x_ch:
        return True
    else:
        return False


num = int(input())
a = 1
result = 0
while True:
    a += 1
    if a>=num:
        if (primenumber(a) == True):
            if palin(a) == True:
                result = a
                break
if result == 0: # 입력값이 만약 최대 값 100만일 경우
    result = 1003001 # 100만 이상이면서 팰림드롬 및 소수일 경우를 적용

print(result)