def bfs(start_i,start_j,arr):
    visited=[[0]*(M+1) for _ in range(N+1)]
    visited[0][0] = 1
    que = []
    que.append((start_i,start_j))
    while que:
        x,y = que.pop(0)
        # if visited[N][M] != 0:
        #     print(visited[N][M])
        #     break
        for di,dj in [[0,1],[1,0],[0,-1],[-1,0]]:   # 동, 남,서,북
            ri, rj = x+di, y + dj
            if 0<=ri<N and 0<=rj<M and visited[ri][rj] == 0 and arr[ri][rj] == '1':
                visited[ri][rj] = visited[x][y]+1
                que.append((ri,rj))
    return visited[N-1][M-1]


N,M = map(int,input().split())
arr = [list(input()) for _ in range(N)]

print(bfs(0,0,arr))
# print(bfs(1,1,arr))
