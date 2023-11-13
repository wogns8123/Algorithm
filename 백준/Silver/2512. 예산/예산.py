n = int(input())
arr = list(map(int,input().split()))
budget = int(input())

start, end = 0, max(arr)

while start <=end:
    mid = (start + end) // 2
    total = 0
    for i in arr:
        if i > mid:
            total += mid
        else:
            total += i
    if total <= budget:
        start = mid + 1
    else:
        end = mid-1
print(end)