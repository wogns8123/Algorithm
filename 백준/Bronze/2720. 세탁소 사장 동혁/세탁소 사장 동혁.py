n = int(input())
coin = [25,10,5,1]
for _ in range(n):
    result = []
    money = int(input())
    for i in coin:
        result.append(money//i)
        money %= i
    print(*result)