def BFS(n,m):
    que = []
    que.append(n)
    while que:
        node = que.pop(0)
        if node == m:
            print(visited[node])
            break
        else:
            lst = [node + 1, node-1,node*2]
            for i in lst:
                if 0<= i <= 100000:
                    if visited[i] ==0:
                        visited[i] = visited[node] + 1
                        que.append(i)
    return visited

N, M = map(int,input().split())
result = 0
visited = [0] * 100001
BFS(N,M)
