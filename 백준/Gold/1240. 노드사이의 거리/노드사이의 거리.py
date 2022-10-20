def bfs(start,end):
    visited = []
    visited.append(start)
    que = []
    que.append((start,0))
    while que:
        node,distance = que.pop(0)
        if node == end:
            return distance
        for i,dis in arr[node]:
            if i not in visited:
                que.append((i,dis+distance))
                visited.append(i)


N, M = map(int,input().split())
arr = [[] * (N+1) for _ in range(N+1)]
distance = []
for _ in range(N-1):
    start, end, distance = map(int,input().split())
    arr[start].append((end,distance))
    arr[end].append((start,distance))

for __ in range(M):
    start, end = map(int,input().split())
    print(bfs(start,end))