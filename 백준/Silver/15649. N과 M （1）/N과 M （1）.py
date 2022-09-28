def f(i,k,r):
    if i == r:
        print(*p)
    else:
        for j in range(k):
            if used[j] == 0:
                used[j] = 1
                p[i] = arr[j]
                f(i+1,k,r)
                used[j] = 0

n,m = map(int,input().split())
arr = list(range(1,n+1))
p = [0] * (m)
used = [0] * n
f(0,n,m)