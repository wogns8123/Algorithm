n = int(input())
arr = []
for i in range(n):
    s = input()
    arr.append(s)
arr = set(arr)
arr = list(arr)

arr.sort()
arr.sort(key = len)

for i in arr:
    print(i)