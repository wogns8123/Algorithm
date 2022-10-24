n = int(input())
arr = list(map(int,input().split()))
arr.sort()
dp = [arr[0]]
for i in range(1,n):
    dp.append(dp[-1]+arr[i])
print(sum(dp))