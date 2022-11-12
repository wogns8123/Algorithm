import sys
arr = input()
ans = set()
for i in range(len(arr)):
    for j in range(i,len(arr)):
        ans.add(arr[i:j+1])

print(len(ans))