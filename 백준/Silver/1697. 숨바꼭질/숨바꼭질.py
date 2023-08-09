from collections import deque

def bfs():
    que = deque()
    que.append(x)
    lst[x] = 1
    while que:
        q = que.popleft()
        if q==y:
            return lst[q]-1
        for i in (q*2, q+1, q-1):
            if 0<=i<100001 and not lst[i]:
                lst[i] = lst[q] +1
                que.append(i)

x,y = map(int,input().split())
lst = [0] * 200001
print(bfs())