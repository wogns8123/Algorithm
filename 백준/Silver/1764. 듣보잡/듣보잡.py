import sys

N_arr = set()
M_arr = set()
ans =[]
N,M = map(int,input().split())
for _ in range(N):
    N_arr.add(input())
for __ in range(M):
    M_arr.add(input())
ans = (N_arr & M_arr)
ans = list(ans)
ans.sort()
print(len(ans))
for i in ans:
    print(i)
