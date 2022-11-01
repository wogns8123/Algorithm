tc = int(input())
dp = [0]*97
dp = [0,1,1,1] + dp
for i in range(4,101):
    dp[i] = (dp[i-3]+dp[i-2])

for test in range(tc):
    n = int(input())
    print(dp[n])

# 1 1 1 2 2 3 4 5 7 9 12 16 21 28 37 49