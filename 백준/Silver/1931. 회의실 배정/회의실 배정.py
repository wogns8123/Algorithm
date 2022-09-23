n = int(input())
arr= []
for _ in range(n):
    arr.append(list(map(int,input().split())))

arr.sort(key= lambda x: x[0])
arr.sort(key= lambda x: x[1])

result = [arr[0]]

for i in range(1, len(arr)):
    if arr[i][0] < result[-1][1]:
        pass
    else:
        result.append(arr[i])
print(len(result))
