for test in range(1,11):
    n = int(input())
    arr = list(map(int,input().split()))        # 큐 형식

    while True:
        for i in range(1,6):
            number = arr.pop(0)

            arr.append(number-i)
            if arr[-1] <= 0:
                arr[-1] = 0
                break
        if arr[-1] <= 0:
            break
    print(f'#{test}', end=' ')
    print(*arr)


