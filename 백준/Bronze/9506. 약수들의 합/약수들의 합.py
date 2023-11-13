while True:
    x = int(input())
    arr = []
    if x == -1:
        break

    for i in range(1,x):
        if x%i == 0:
            arr.append(i)
    if sum(arr) == x:
        print(x,'=' , ' + '.join(str(i) for i in arr))
    else:
        print(x,'is NOT perfect.')
