n = int(input())
arr = []
for _ in range(n):
    lope = int(input())
    arr.append(lope)
arr.sort()

result = []
for i in range(n):
    num = n-i
    result.append(arr[i]*num)

print(max(result))