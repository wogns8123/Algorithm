import sys
N = int(sys.stdin.readline())
arr_N = list(map(int, sys.stdin.readline().split()))
M = int(sys.stdin.readline())
arr_M = list(map(int, sys.stdin.readline().split()))

arr_N = set(arr_N)

for i in arr_M:
    if i in arr_N:
        print(1)
    else:
        print(0)
