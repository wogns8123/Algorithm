M, N = map(int,input().split()) 

arr = [list(map(str,input())) for _ in range(M)]
short = min(M,N)

result = 1

for x in range(short,0,-1):     # 크기
    for i in range(M):
        for j in range(N):
            if (i+x)<M and (j+x)< N and arr[i][j] == arr[i+x][j] == arr[i][j+x] == arr[i+x][j+x]:
                result = max(result, (x+1)**2)
                break
print(result)
