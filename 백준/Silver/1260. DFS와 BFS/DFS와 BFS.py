import sys
sys.setrecursionlimit(10**6)

def dfs(n,arr,visited):
    visited[n]=1
    print(n,end=' ')
    for node in arr[n]:
        if visited[node] == 0:
            dfs(node,arr,visited)


def bfs(s,arr,visited):
    que = []
    que.append(s)
    visited[s] = 1

    while que:
        node = que.pop(0)
        print(node,end=' ')
        for i in arr[node]:
            if visited[i] ==0:
                visited[i] = 1
                que.append(i)




V, E, root = map(int,input().split())
arr=[[] for _ in range(V+1)]
for _ in range(E):
    start,end = map(int,input().split())
    arr[end].append(start)
    arr[start].append(end)
for i in range(len(arr)):
    arr[i].sort()
visited= [0]*(V+1)
visited_bfs = [0]*(V+1)

dfs(root,arr,visited)
print()
bfs(root,arr,visited_bfs)