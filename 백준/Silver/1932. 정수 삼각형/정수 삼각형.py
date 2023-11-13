from sys import stdin; input = stdin.readline

line = int(input())
arr = []
for _ in range(line):
    arr.append(list(map(int,input().split())))
for i in range(1,line):
    for j in range(len(arr[i])):
        if j == 0:
            arr[i][j] = arr[i][j] + arr[i-1][j]
        elif j == len(arr[i])-1:
            arr[i][j] = arr[i][j] + arr[i-1][j-1]
        else:
            arr[i][j] = arr[i][j] + max(arr[i-1][j],arr[i-1][j-1])

print(max(arr[line-1]))