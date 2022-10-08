tc = int(input())
for test in range(tc):
    n = int(input())
    arr = [list(input()) for _ in range(n)]
    ans = []
    total = 0

    for i in range(n//2+1):
        ans.append(arr[i][n//2-i:n//2+i+1])
    for i in range(n//2):
        ans.append(arr[n-i-1][n//2-i:n//2+i+1])
    for i in ans:
        for j in i:
            total += int(j)
    print(f'#{test+1} {total}')
