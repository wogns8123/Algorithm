n = int(input())

max_len = 0
result= []
for i in range(n+1):
    arr = [n,i]
    j = 0
    while True:
        arr_ap = arr[j]-arr[j+1]
        if arr_ap<0:
            break
        else:
            arr.append(arr_ap)
        if max_len < len(arr):
            max_len = len(arr)
            result = arr[:]
        j += 1
print(max_len)
print(*result)
