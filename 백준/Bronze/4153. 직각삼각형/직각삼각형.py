while True:
    arr = list(map(int, input().split()))
    arr = sorted(arr)
    if sum(arr) == 0:
        break
    else:
        if arr[0]**2 + arr[1]**2 == arr[2]**2:
            print('right')
        else:
            print('wrong')