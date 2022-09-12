arr = [1,1,2,2,2,8]
arr_ = list(map(int,input().split()))
result = []
for i in range(len(arr)):
    result.append(arr[i]-arr_[i])
print(*result)