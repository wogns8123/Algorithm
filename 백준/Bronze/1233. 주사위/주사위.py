a,b,c = map(int,input().split())
li = [0]*81

for i in range(1, a+1):
    for j in range(1, b+1):
        for q in range(1, c+1):
            li[i+j+q] += 1
print(li.index(max(li)))