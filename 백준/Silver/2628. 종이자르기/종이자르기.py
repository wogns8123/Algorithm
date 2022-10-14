N, M = map(int,input().split())
row = [0,N]
col = [0,M]
num = int(input())
for _ in range(num):
    direction, idx = map(int,input().split())
    if direction == 0:
        col.append(idx)
    else:
        row.append(idx)
row.sort()
col.sort()
row_width = []
col_width = []
for i in range(len(row)-1):
    row_width.append(row[i+1]-row[i])
for i in range(len(col)-1):
    col_width.append(col[i+1]-col[i])
print(max(row_width) * max(col_width))
