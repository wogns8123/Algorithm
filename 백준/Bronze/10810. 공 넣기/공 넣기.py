n,m = map(int,input().split())

arr = [0 for __ in range(n)]
for _ in range(m):
    i, j, k = map(int, input().split())
    arr[i-1:j] = [k for ___ in range(j-i+1)]
print(*arr)