import sys

n = int(sys.stdin.readline())
count_0 = [1,0]
memo = [0,1]
if n>1:
    for i in range(n-1):
        memo.append(memo[-1] + memo[-2])

print(memo[n])