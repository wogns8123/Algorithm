m, n = map(int,input().split())
arr = [list(input()) for _ in range(m)]
arr_turn = list(zip(*arr))

x_count = 0
y_count = 0
for i in range(m):
    if 'X' not in arr[i]:
        x_count += 1
for j in range(n):
    if 'X' not in arr_turn[j]:
        y_count += 1
print(max(x_count,y_count))