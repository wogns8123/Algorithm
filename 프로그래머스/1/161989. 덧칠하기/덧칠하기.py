def solution(n, m, section):
    arr = [1 for _ in range(n+1)]
    for i in section:
        arr[i] = 0
    arr.pop(0)
    count = 0
    while 1:
        for i in range(len(arr)):
            if arr[i] == 0:
                if i+m > n-1:
                    arr[n-m:n] = [1] * m
                    count += 1
                else:
                    arr[i:i+m] = [1] * m
                    count += 1
        if arr == [1]*n:
            break

    return count