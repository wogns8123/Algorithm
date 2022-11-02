dp = [0] * 1000001

dp[1] = 1
dp[2] = 2

for i in range(3,1000001):
    dp[i] = dp[i-2]+dp[i-1]
    if dp[i] >=15746:
        dp[i] = dp[i]%15746

n = int(input())
print(dp[n])

# 0 1 2 3 5