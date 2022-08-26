x = []
y = []
for _ in range(4):
    down_x, down_y, up_x,up_y = map(int,input().split())
    x.append(down_x)
    x.append(up_x)
    y.append(down_y)
    y.append(up_y)
arr = [[0]*max(y)  for _ in range(max(x))]
for q in range(4):
    for i in range(x[q*2],x[q*2+1]):
        for j in range(y[q*2],y[q*2+1]):
            arr[i][j] = 1
count = 0
for i in range(max(x)):
    for j in range(max(y)):
        if arr[i][j] == 1:
            count +=1
print(count)