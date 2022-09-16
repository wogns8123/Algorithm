n = int(input())
arr = []
for _ in range(n):
    arr.append(int(input()))
a = arr[1:]
a.sort()
count = 0
if len(arr) == 1:
    print(0)
else:
    while True:
        if a[-1] >= arr[0]:
            arr[0] += 1
            a[-1] -= 1
            count +=1
            a.sort()
        if a[-1] < arr[0]:
            break
    print(count)