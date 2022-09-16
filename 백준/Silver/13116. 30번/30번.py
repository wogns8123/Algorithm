tc = int(input())
for test in range(tc):
    a, b = map(int,input().split())

    while True:
        if a == b:
            break
        else:
            if a>b:
                a = a//2
            else:
                b = b//2
    print(a*10)