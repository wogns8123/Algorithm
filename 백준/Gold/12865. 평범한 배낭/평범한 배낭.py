n, k = map(int,input().split())
check = [0] * (n)

for _ in range(n):
    check[_] = list(map(int,input().split()))
check.sort()

dp = [[0] * (k+1) for _ in range(n+1)]
for i in range(1, len(dp)):
    weight, value = check[i-1]
    for j in range(1, len(dp[i])):
        if j>= weight:
            dp[i][j] = max(dp[i-1][j], dp[i-1][j-weight]+value)
        else:
            dp[i][j] = dp[i-1][j]

print(dp[-1][-1])