import sys

n = int(input())
result = [1] * 1000
for _ in range(n):
    num,s,b = map(int,input().split())
    num = str(num)
    for i in range(123,988):
        ball = 0
        strike = 0
        i = str(i)
        if i[0] == i[1] or i[0] == i[2] or i[1]==i[2]:
            result[int(i)] = 0
        if i[0] =='0' or i[1] =='0' or i[2] =='0':
            result[int(i)] = 0
        for q in range(3):
            for w in range(3):
                if i[q] == num[w]:
                    if q==w:
                        strike += 1
                    else:
                        ball += 1
        if result[int(i)]==1 and ball == b and strike==s:
            result[int(i)] = 1
        else:
            result[int(i)] = 0
count = 0
for i in range(123,988):
    if result[i] == 1:
        count +=1
print(count)