from collections import Counter
n = int(input())
arrn = list(map(int,input().split()))
m = int(input())
arrm = list(map(int,input().split()))
result = [0 for _ in range(m)]
count = Counter(arrn)

for i in range(m):
    if arrm[i] in count:
        print(count[arrm[i]], end=" ")
    else:
        print(0, end=" ")

