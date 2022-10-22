N, M = map(int,input().split())
arr = set()
for _ in range(N):
    arr.add(input())
check = []
count = 0
for _ in range(M):
    check.append((input()))
for i in range(len(check)):
    if check[i] in arr:
        count += 1
print(count)