n = int(input())
line = [0] * (n)
for _ in range(n):
    line[_] = list(map(int,input().split()))
line.sort()
# print(line)
check = []
for _ in range(n):
    check.append(line[_][1])
# print(check)
dp = [1 for i in range(n)]
for i in range(n):
    for j in range(i):
        if check[i] > check[j]:
            dp[i] = max(dp[i], dp[j] + 1)
# print(dp)
print(n-max(dp))


