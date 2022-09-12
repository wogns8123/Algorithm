a = int(input())
b = input()
for i in range(len(b)):
    num = len(b)-i-1
    print(a*int(b[num]))
print(a*int(b))