import sys
from collections import deque
test = int(input())

def dfs(n):
    global count
    visited[n] = 1
    for i in arr[n]:
        if visited[i] == 0:
            count = dfs(i)+1
    return count

for _ in range(test):
    N, M = map(int,sys.stdin.readline().split())
    arr = [[] for _ in range(N+1)]
    for __ in range(M):
        a, b = map(int,sys.stdin.readline().split())
        arr[a].append(b)
        arr[b].append(a)
    visited = [0] * (N+1)
    count = 0
    print(dfs(1))