import sys
from collections import Counter

n = int(sys.stdin.readline())
arr = []
for _ in range(n):
    arr.append(int(sys.stdin.readline()))
arr.sort()

print(round(sum(arr)/len(arr)))
print(arr[len(arr)//2])

cnt = Counter(arr)
a = (cnt.most_common())
if len(a)>1:
    if a[0][1] == a[1][1]:
        print(a[1][0])
    else:
        print(a[0][0])
else:
    print(a[0][0])

print(max(arr)-min(arr))