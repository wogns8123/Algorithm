words = []
length = []
for _ in range(5):
    s = str(input())
    words.append(s)
    length.append(len(s))

result = ''
for i in range(max(length)):
    for j in range(5):
        if i < length[j]:
           result += words[j][i]
print(result)



