Testcase =int(input())
for _ in range(Testcase):
    a = int(input())

    for i in range(2, 1000001):
        if a % i == 0:
            print("NO")
            break
        if i == 1000000:
            print("YES")
