n = int(input())
result = 1
for i in range(2,n+1):
    result *= i
    while True:
        if str(result)[-1] == '0':
            result //=10
        else:
            break
    result %= 1000000000000
print(str(result)[-5:])