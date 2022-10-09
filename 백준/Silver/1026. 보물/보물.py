n = int(input())
arr_A = list(map(int,input().split()))
arr_B = list(map(int,input().split()))

ans = 0
for i in range(n):
    ans += (min(arr_A) * max(arr_B))
    arr_A.pop(arr_A.index(min(arr_A)))
    arr_B.pop(arr_B.index(max(arr_B)))
print(ans)