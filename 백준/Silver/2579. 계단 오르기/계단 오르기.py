import sys

n = int(input())
stair = [0]
for _ in range(n):
    stair.append(int(input()))
dp = [0] * (n+1)
if n== 1:
    print(stair[1])
else:
    dp[1] = stair[1]
    dp[2] = stair[2] + stair[1]

    for i in range(3,n+1):
        dp[i] = max(dp[i-3]+stair[i-1], dp[i-2]) + stair[i]

    print(dp[-1])