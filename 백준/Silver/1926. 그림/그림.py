import sys

from collections import deque

def bfs(start_i,start_j):
    que = deque()
    que.append((start_i,start_j))
    arr[start_i][start_j] = 0
    count = 1
    while que:
        i, j = que.popleft()
        for si, sj in [[0,1],[1,0],[0,-1],[-1,0]]:
            ri, rj = i+si, j+sj
            if 0<=ri<N and 0<=rj<M and arr[ri][rj] == 1:
                arr[ri][rj] = 0
                que.append((ri,rj))
                count += 1
    return count

N,M = map(int,input().split())
arr = [list(map(int,input().split())) for _ in range(N)]

ans = []
for i in range(N):
    for j in range(M):
        if arr[i][j] == 1:
            ans.append(bfs(i,j))
if len(ans) == 0:
    print(len(ans))
    print(0)
else:
    print(len(ans))
    print(max(ans))