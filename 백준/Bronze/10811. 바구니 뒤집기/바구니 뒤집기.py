n, m = map(int,input().split())
arr = []
for _ in range(n):
    arr.append(_+1)

for __ in range(m):
    i, j = map(int,input().split())
    arr[i-1:j] = list(reversed(arr[i-1:j]))

print(*arr)