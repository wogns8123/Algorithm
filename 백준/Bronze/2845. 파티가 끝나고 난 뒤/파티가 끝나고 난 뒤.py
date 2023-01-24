a, b = map(int,input().split())
people = a*b

five = list(map(int,input().split()))

result = []
for i in five:
    result.append(i-people)

print(*result)
