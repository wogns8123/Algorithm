number = '0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ'

check, num = map(str, input().split())
num = int(num)
result = 0
for i in range(len(check)-1,-1,-1):
    sum = number.index(check[len(check)-i-1]) * (num**i)
    result += sum
    # print(number.index(check[i]))
print(result)