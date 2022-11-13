import sys

n, k = map(int,input().split())
money = [0]*n
for _ in range(n):
    money[_] = int(input())
money.sort(reverse=True)

count = 0
idx = 0
while k!= 0:
    if k>=money[idx]:
        count+=(k//money[idx])
        k%=money[idx]
    else:
        idx+=1

print(count)
