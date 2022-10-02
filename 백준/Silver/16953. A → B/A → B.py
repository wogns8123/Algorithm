import sys

def bfs(n,m):
    que = []
    que.append((n,1))
    count = 0
    while que:
        node,cnt = que.pop(0)
        if node == m:
            print(cnt)
            break

        if node * 2 <= m:
            que.append((node*2,cnt+1))

        if node * 10 + 1 <= m:
            que.append((node*10 + 1,cnt+1))
    else:
        print(-1)
start, end = map(int,input().split())
bfs(start,end)