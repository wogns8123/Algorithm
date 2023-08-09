from collections import deque
def bfs(x,y):
    que = deque()
    que.append((x,y))
    graph[x][y] = 0

    dx = [-1,1,0,0]
    dy = [0,0,-1,1]

    while que:
        rx,ry = que.popleft()
        for i in range(4):
            qx = rx + dx[i]
            qy = ry + dy[i]
            if 0<=qx<m and 0<=qy<n:
                if graph[qx][qy] == 1:
                    graph[qx][qy] = 0
                    que.append((qx,qy))


t = int(input())
for _ in range(t):
    m,n,k = map(int,input().split())
    graph = [[0] * (n+1) for _ in range(m+1)]
    for __ in range(k):
        x,y = map(int,input().split())
        graph[x][y] = 1
    result = 0
    for i in range(m):
        for j in range(n):
            if graph[i][j] ==1:
                bfs(i,j)
                result+=1
    print(result)