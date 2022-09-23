def binary(arr, x):
    start = 0
    end = len(arr) - 1
    while start <= end:
        mid = (start + end) // 2
        if arr[mid] == x:
            return 1
        elif arr[mid] < x:
            start = mid + 1
        else:
            end = mid - 1
    return -1


n = int(input())
arr_n = list(map(int, input().split()))
m = int(input())
arr_m = list(map(int, input().split()))
result = [0] * m
arr_n.sort()
for i in range(m):
    if binary(arr_n, arr_m[i]) ==1:
        result[i] = 1
    else:
        result[i] = 0
print(*result)
