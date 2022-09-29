import sys

N,M = map(int,sys.stdin.readline().split())
arr = list(map(int,sys.stdin.readline().split()))
memo = [0] * (N+1)
memo[0] = arr[0]

for i in range(1,N):
    memo[i] = memo[i-1]+arr[i]
memo = [0] + memo

for i in range(M):
    a,b = map(int,sys.stdin.readline().split())
    print(memo[b]-memo[a-1])
