import sys
sys.setrecursionlimit(10 ** 6)


n = int(input())
memo = [0,1,2]
for i in range(3,1001):
    memo.append(memo[i-1]+memo[i-2])

print(memo[n]%10007)
