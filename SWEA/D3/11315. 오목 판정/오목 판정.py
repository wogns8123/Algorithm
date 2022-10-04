def f(arr):
    di = [0, 1, 1, 1]
    dj = [1, 0, -1, 1]
    for i in range(N):
        for j in range(N):
            if arr[i][j] == 'o':
                for d in range(4):
                    r = i
                    c = j
                    count = 0
                    while 0 <= r < N and 0 <= c < N and arr[r][c] == 'o':
                        count += 1
                        r += di[d]
                        c += dj[d]
                    if count >= 5:
                        return 'YES'
    return 'NO'

tc = int(input())
for test in range(tc):
    N = int(input())
    arr = [input() for _ in range(N)]
    print(f'#{test + 1} {f(arr)}')
