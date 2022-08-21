import sys

N, M = map(int,sys.stdin.readline().split())
arr_N = list(map(int,sys.stdin.readline().split()))
arr_M = list(map(int,sys.stdin.readline().split()))


result = []
result = arr_N + arr_M
result.sort()
# for i in range(len(result)-1,0,-1):
#     for j in range(i):
#         if result[j] > result[j+1]:
#             result[j],result[j+1] = result[j+1],result[j]
print(*result)