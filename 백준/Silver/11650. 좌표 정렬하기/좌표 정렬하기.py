import sys

num = int(sys.stdin.readline())
a = []

for i in range(num):
    b = (list(map(int,sys.stdin.readline().split())))
    a.append(b)
sort_a = sorted(a)
for i in range(num):
    print(sort_a[i][0], sort_a[i][1])


