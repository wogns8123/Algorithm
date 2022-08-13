import sys
num = int(sys.stdin.readline())
a = []

for i in range(num):
    b = (list(map(int,sys.stdin.readline().split())))
    a.append(b)
a.sort(key = lambda x:(x[1],x[0]))

for i in range(num):
    print(a[i][0], a[i][1])