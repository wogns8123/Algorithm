N, M = map(int,input().split())
min_money = 9999
min_each = 9999
for _ in range(M):
    money, each = map(int,input().split())
    if min_money>money:
        min_money = money
    if min_each>each:
        min_each = each
count = 0
ans = 0
if N >=6:
    if 6 * min_each > min_money:
        while N>=6:
            N-=6
            count += 1
            ans = count * min_money
            if N * min_each > min_money:
                ans += min_money
            else:
                ans += N * min_each
    else:
        ans += min_each * N
else:
    if N * min_each > min_money:
        ans += min_money
    else:
        ans += N * min_each

print(ans)

