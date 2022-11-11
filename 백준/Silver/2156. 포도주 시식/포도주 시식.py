import sys
input = sys.stdin.readline
n = int(input())
alco_list = []
for _ in range(n):
    alco_list.append(int(input()))
dp = [0] * (n+1)

for i in range(1,n+1):
    if i<=2:
        dp[i] = dp[i-1] + alco_list[i-1]
        continue

    dp[i] = max(dp[i-3]+alco_list[i-2], dp[i-2]) + alco_list[i-1]
    dp[i] = max(dp[i-1],dp[i])

print(max(dp))