N, K = map(int,input().split())

check = [1] * (N+1)
count = 0
for i in range(2,len(check)+1):
    for j in range(i,N+1,i):
        if check[j] == 1:
            check[j] = 0
            count += 1
            if count == K:
                print(j)
                break