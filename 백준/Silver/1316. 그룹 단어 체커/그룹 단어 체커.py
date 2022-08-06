num = int(input())
count = num
for i in range(num):
    s = input()
    for idx in range(len(s)-1):
        if s[idx] == s[idx+1]:
            pass
        elif s[idx] in s[idx+1::]:
            count-=1
            break
print(count)