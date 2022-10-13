import sys
def f(i,M):
    if len(p) == M:
        print(' '.join(map(str,p)))
    else:
        for j in range(i,N+1):
            p.append(j)
            f(j,M)
            p.pop()

N, M = map(int,input().split())

p = []
f(1,M)