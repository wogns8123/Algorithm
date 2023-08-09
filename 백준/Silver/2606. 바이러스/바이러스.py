def dfs(graph,start):
    visited, need_to = list(),list()
    need_to.append(start)
    while need_to:
        node = need_to.pop()
        if node not in visited:
            visited.append(node)
            need_to.extend(graph[node])
    return len(visited)-1

computer = int(input())
N = int(input())
graph = [[] for _ in range(computer+1)]

for i in range(N):
    a,b = map(int,input().split())
    graph[a].append(b)
    graph[b].append(a)
visited = [0]*computer
print(dfs(graph,1))
