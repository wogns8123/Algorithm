arr = [int(input()) for _ in range(9)]
total = 0
for i in arr:
    total += i
arr1 = 0
arr2 = 0
for i in range(len(arr)):
    for j in range(i+1, len(arr)):
        if total - (arr[i]+arr[j]) == 100:
            arr1 = arr[i]
            arr2 = arr[j]
arr.remove(arr1)
arr.remove(arr2)
for i in arr:
    print(i)

