money = int(input())
extra = 1000-money
count = 0
while True:
    if extra>=500:
        count += 1
        extra -= 500
    elif extra >= 100:
        count += 1
        extra -= 100
    elif extra>=50:
        count += 1
        extra -= 50
    elif extra>=10:
        count += 1
        extra -= 10
    elif extra>=5:
        count += 1
        extra -= 5
    elif extra>=1:
        count += 1
        extra -= 1
    if extra == 0:
        break
print(count)