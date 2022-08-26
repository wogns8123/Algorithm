student = int(input())
arr = list(map(int,input().split()))
line = []
for i in range(len(arr)):
    line.insert(arr[i],i+1)
line.reverse()
print(*line)