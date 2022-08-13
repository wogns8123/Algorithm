import sys

num = int(sys.stdin.readline())
a = []

for i in range(num):
    b = (list(map(int,sys.stdin.readline().split())))
    b[0], b[1] = b[1],b[0]
    a.append(b)
sort_a = sorted(a)
for i in range(len(sort_a)):
    sort_a[i][0],sort_a[i][1]=sort_a[i][1],sort_a[i][0]
for i in range(num):
    print(sort_a[i][0], sort_a[i][1])