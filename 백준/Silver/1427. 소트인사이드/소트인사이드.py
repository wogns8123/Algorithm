n = list(map(int,input()))

for i in range(len(n)-1,0,-1):
    for j in range(i):
        if n[j] < n[j+1]:
            n[j], n[j+1] = n[j+1], n[j]
result = ''
for i in n:
    result += str(i)
print(result)


