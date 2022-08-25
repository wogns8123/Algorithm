import sys
num = int(sys.stdin.readline())
lst = []
for i in range(num):
    s = sys.stdin.readline().split()

    if s[0] == 'push':
        lst.append(s[1])
    elif s[0] == 'pop':
        if len(lst) == 0:
            print(-1)
        else:
            number = lst.pop(0)

            print(number)
    elif s[0] == 'size':
        print(len(lst))
    elif s[0] == 'empty':
        if len(lst) != 0:
            print(0)
        else:
            print(1)
    elif s[0] == 'front':
        if len(lst) != 0:
            print(lst[0])
        else:
            print(-1)
    elif s[0] == 'back':
        if len(lst) == 0:
            print(-1)
        else:
            print(lst[-1])

