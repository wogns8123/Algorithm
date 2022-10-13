import sys

C, N = map(int,input().split())
city_list = []

for _ in range(N):
    cost, custom = map(int,input().split())
    city_list.append((cost,custom))

dp = [10**5] * 1101
dp[0] = 0
for cost, custom in city_list:
    for i in range(custom,C+101):
        dp[i] = min(dp[i], dp[i-custom]+cost)

print(min(dp[C:]))

