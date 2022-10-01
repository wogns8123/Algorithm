import sys
sys.setrecursionlimit(10**6)
def DFS(n):
    visited[n] = 1
    for j in arr[n]:
        if visited[j] == 0:
            DFS(j)

N,M = map(int,sys.stdin.readline().split())
arr = [[] for _ in range(N+1)]
for _ in range(M):
    u,v = map(int,sys.stdin.readline().split())
    arr[u].append(v)
    arr[v].append(u)
count = 0
visited = [0] * (N+1)

for i in range(1,N+1):
    if visited[i] == 0:
        if not arr[i]:
            count += 1
            visited[i] = 1
        else:
            count +=1
            DFS(i)
print(count)
