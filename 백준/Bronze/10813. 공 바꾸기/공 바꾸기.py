n, m = map(int,input().split())
arr = []
for _ in range(n):
    arr.append(_+1)

for __ in  range(m):
    i, j = map(int,input().split())
    sth = 0
    sth = arr[i-1]
    arr[i-1] = arr[j-1]
    arr[j-1] = sth
print(*arr)