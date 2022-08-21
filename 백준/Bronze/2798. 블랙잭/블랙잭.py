n, max = map(int,input().split())
arr = list(map(int,input().split()))
result = []
for i in range(len(arr)):
    for j in range(i+1,len(arr)):
        for q in range(j+1,len(arr)):
            if (arr[i] + arr[j] + arr[q]) <= max:
                result.append(arr[i] + arr[j] + arr[q])
max = 0
for i in range(len(result)):
    if max < result[i]:
        max = result[i]
print(max)





