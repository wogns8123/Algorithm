total = int(input())
num = int(input())
result = []
for _ in range(num):
    a,b = map(int,input().split())
    result.append(a*b)
if total == sum(result):
    print('Yes')
else:
    print('No')