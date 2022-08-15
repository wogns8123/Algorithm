import sys

tc = int(sys.stdin.readline())
arr = []
for _ in range(tc):
    a, b = tuple(map(str, sys.stdin.readline().split()))
    a = int(a)
    arr.append((a, b))
    
arr.sort(key=lambda x: x[0])

for i in arr:
    print(i[0], i[1])
