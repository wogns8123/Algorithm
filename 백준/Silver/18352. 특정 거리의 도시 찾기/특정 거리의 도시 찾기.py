from collections import deque
import sys

def bfs(n):
    ans = []
    que = deque()
    que.append(n)
    visited[n] = 1
    distance[n] = 0
    while que:
        node = que.popleft()
        for i in arr[node]:
            if visited[i] == 0:
                visited[i] = 1
                que.append(i)
                distance[i] = distance[node] +1
                if distance[i] == K:
                    ans.append(i)
    if len(ans)==0:
        print(-1)
    else:
        ans.sort()
        for i in ans:
            print(i)

N,M,K,X = map(int,sys.stdin.readline().split())
arr = [[] for _ in range(N+1)]
visited=[0]*(N+1)
distance = [0] * (N+1)

ans = []
for _ in range(M):
    a,b=map(int,sys.stdin.readline().split())
    arr[a].append(b)

bfs(X)

