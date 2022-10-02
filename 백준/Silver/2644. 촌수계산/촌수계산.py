import sys
from collections import deque

n = int(input())
person1,person2 = map(int,input().split())
m = int(input())
visited= [0] *(n+1)
def bfs(start):
    que = deque()
    que.append(start)
    visited[start] = 1
    while que:
        node = que.popleft()
        for j in graph[node]:
            if visited[j] == 0:
                visited[j] = visited[node]+1
                que.append(j)


graph = [[] for _ in range(n+1)]
for _ in range(m):
    a,b = map(int,input().split())
    graph[a].append(b)
    graph[b].append(a)

bfs(person1)
# print(visited)
if visited[person2] == 0 or visited[person1] == 0:
    print(-1)
else:
    print(abs(visited[person1]-visited[person2]))