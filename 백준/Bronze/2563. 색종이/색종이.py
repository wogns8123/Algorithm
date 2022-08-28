num = int(input())
x_a = []
y_a = []
for _ in range(num):
    x, y = map(int, input().split())
    x_a.append(x)
    y_a.append(y)
arr = [[0] * (max(x_a) + 11) for _ in range(max(y_a) + 11)]

total = 0
for q in range(num):
    for i in range(y_a[q], y_a[q] + 10):
        for j in range(x_a[q], x_a[q] + 10):
            arr[i][j] = 1

for i in arr:
    for j in i:
        total += j
print(total)