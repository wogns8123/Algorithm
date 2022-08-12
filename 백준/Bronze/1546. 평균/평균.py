n = int(input())
arr = list(map(int,input().split()))
max_arr = max(arr)

for i in range(len(arr)):
    arr[i] = arr[i]/max_arr*100

average = sum(arr)/n
print(average)