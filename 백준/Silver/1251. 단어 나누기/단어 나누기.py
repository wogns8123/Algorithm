s = input()
seperate = []

for i in range(1,len(s)-1):
    for j in range(i+1, len(s)):
        a = s[:i]
        b = s[i:j]
        c = s[j:]

        a = a[::-1]
        b = b[::-1]
        c = c[::-1]


        seperate.append(a+b+c)
seperate.sort()
print(seperate[0])