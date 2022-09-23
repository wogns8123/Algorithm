import sys

tc = int(sys.stdin.readline())
for _ in range(tc):
    n = int(sys.stdin.readline())
    count_0 = [1,0]
    count_1 = [0,1]
    if n>1:
        for i in range(n-1):
            count_0.append(count_1[-1])
            count_1.append(count_0[-2]+count_1[-1])
    print(count_0[n],count_1[n])


