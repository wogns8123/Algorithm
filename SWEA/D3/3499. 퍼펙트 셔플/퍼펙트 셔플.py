tc = int(input())
for test in range(tc):
    n = int(input())
    arr = list(map(str,input().split()))
    if n % 2==0:
        arr1 = arr[:n//2]
        arr2 = arr[n//2:]
    else:
        arr1 = arr[:n//2+1]
        arr2 = arr[n//2+1:]
    ans = []
    for i in range(len(arr2)):
        ans.append(arr1.pop(0))
        ans.append(arr2.pop(0))
    if len(arr1) != 0:
        ans.append(arr1.pop(0))
    
    print(f'#{test+1}', end= ' ')
    print(*ans)