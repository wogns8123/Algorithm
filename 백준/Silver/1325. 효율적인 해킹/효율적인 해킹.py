from collections import deque
from sys import stdin; input = stdin.readline

def bfs(start):
    que = deque()
    que.append(start)
    visited = [False] * (n+1)
    visited[start] = 1
    count = 1
    while que:
        q = que.popleft()
        for a in graph[q]:
            if not visited[a]:
                visited[a] = 1
                que.append(a)
                count +=1
    return count

n, m = map(int,input().split())
graph = [[] for _ in range(n+1)]
for _ in range(m):
    x,y = map(int,input().split())
    graph[y].append(x)

max_value = -1
result = []

for i in range(1, n+1):
    c = bfs(i)
    if c>max_value:
        result.clear()
        result.append(i)
        max_value = c
    elif c == max_value:
        result.append(i)

print(*result)


