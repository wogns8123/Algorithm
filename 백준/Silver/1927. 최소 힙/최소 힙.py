import sys, heapq

n = int(sys.stdin.readline())
arr = []
for _ in range(n):
    a = int(sys.stdin.readline())
    if a>0:
        heapq.heappush(arr,a)
    elif a ==0:
        if len(arr) == 0:
            print(0)
        else:
            print(heapq.heappop(arr))

