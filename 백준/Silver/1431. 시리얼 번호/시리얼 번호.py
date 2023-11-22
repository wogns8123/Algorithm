n = int(input())
total = []
for _ in range(n):
    serier = input()
    total.append(serier)
total = sorted(total, key=len)

for i in range(n-1):
    for j in range(i+1,n):
        if len(total[i]) == len(total[j]):
            checkI = 0
            checkJ = 0
            for x, y in zip(total[i], total[j]):
                if x.isdigit():
                    checkI+=int(x)
                if y.isdigit():
                    checkJ+=int(y)
            if checkI > checkJ:
                total[i], total[j] = total[j], total[i]
            elif checkI == checkJ:
                for x, y in zip(total[i], total[j]):
                    if x > y:
                        total[i], total[j] = total[j], total[i]
                        break
                    elif x < y:
                        break
for __ in total:
    print(__)