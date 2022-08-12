s = input()
s = s.lower()

count = []
result = {}
for i in s:
    if i in result:
        result[i] += 1
    else:
        result[i] = 1

for key, value in result.items():
    if value == max(result.values()):
        count.append(key)

if len(count) != 1:
    print('?')
else:
    print(count[0].upper())
    