n = int(input())
check = {}
for _ in range(n):
    name, condition = map(str,input().split())
    if condition =='enter':
        check[name] = 1
    else:
        del check[name]
check = sorted(check.keys(), reverse=True)
for i in check:
    print(i)