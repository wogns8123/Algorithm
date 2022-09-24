from collections import deque

n, k = map(int,input().split())

arr = deque(list(range(1,n+1)))

result = []
print('<',end='')
while len(arr) != 0:
    for i in range(k-1):
        arr.append(arr[0])
        arr.popleft()
    print(arr.popleft(),end='')
    if arr:
        print(',',end=' ')

print('>')
