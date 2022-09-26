tc = int(input())
for test in range(tc):
    N, Q = map(int,input().split())
    arr = [0] * N
    # [0 0 0 0 0]
    for _ in range(Q):
        start, end = map(int,input().split())
        for i in range(start-1,end):
            arr[i] = _+1

    print(f'#{test+1}',end=' ')
    for i in arr:
        print(i,end=' ')
    print()