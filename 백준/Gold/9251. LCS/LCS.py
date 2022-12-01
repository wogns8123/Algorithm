s1 = list(input())
s2 = list(input())

dp = [[0] * (len(s1)+1) for _ in range(len(s2)+1)]

for i in range(len(s2)):
    for j in range(len(s1)):
        if s2[i] == s1[j]:
            dp[i+1][j+1] = dp[i][j] + 1
        else:
            dp[i+1][j+1] = max(dp[i][j+1], dp[i+1][j])

print(dp[-1][-1])


