N = int(input())
arr = list(map(int,input().split()))
dp = [1] * (N)
for i in range(N):
    max_value = 0
    for j in range(i):
        if arr[j] < arr[i]:
            max_value = max(max_value,dp[j])
    dp[i] = max_value+1
print(max(dp))