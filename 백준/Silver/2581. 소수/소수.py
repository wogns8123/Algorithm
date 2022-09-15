import math
def primenumber(x):
    if x == 1:
        return False
    for i in range(2, int(math.sqrt(x)) + 1):
        if x % i == 0:
            return False
    return True
m = int(input())
n = int(input())
arr = list(range(m,n+1))
result = []
for i in arr:
    if primenumber(i) == True:
        result.append(i)
if len(result) == 0:
    print(-1)
else:
    print(sum(result))
    print(min(result))