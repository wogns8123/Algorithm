import sys

N,M = map(int,input().split())

def f(i,k,r):
    global ans
    if i == r:
        ans.append(p[:])
    else:
        for j in range(k):
            if used[j] == 0:

                used[j] = 1
                p[i] = arr[j]
                f(i+1,k,r)
                used[j] = 0


arr = list(range(1,N+1))
p = [0] * (M)
used = [0]* (N)
ans = []
f(0,N,M)
# print(ans)
result = []
for j in range(len(ans)):
    cnt = 0
    for i in range(1,M):
        if ans[j][i-1]< ans[j][i]:
            cnt += 1
    if cnt == M-1:
        result.append(ans[j])
for i in result:
    print(*i)
