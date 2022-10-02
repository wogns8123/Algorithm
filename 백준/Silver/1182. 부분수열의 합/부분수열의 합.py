import sys

N,S = map(int,input().split())
arr = list(map(int,input().split()))
result = []
for i in range(1<<len(arr)):
    subset = []
    for j in range(len(arr)):
        if i&(1<<j):
            subset.append(arr[j])

    if sum(subset) == S:
        result.append(subset)
if S == 0:
    print(len(result)-1)
else:
    print(len(result))

