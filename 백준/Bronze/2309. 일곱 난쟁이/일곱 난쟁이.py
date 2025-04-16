arr = []
for test in range(9):
    arr.append(int(input()))
result = []
total = 0
for i in arr:
    total += i
arr1 = 0
arr2 = 0
for i in range(len(arr)):
    for j in range(i + 1, len(arr)):
        if total - (arr[i] + arr[j]) == 100:
            arr1 = arr[i]
            arr2 = arr[j]
arr.remove(arr1)
arr.remove(arr2)
arr.sort()
for i in arr:
    print(i)
