n = int(input())
result = "%.300f"%2 ** -n
lenrst = len(result)
for i in range(len(result)-1, 1, -1):
    if result[i] != '0':
        lenrst = i
        break
print(result[:lenrst+1])