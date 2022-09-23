tc = int(input())
for test in range(tc):
    k = int(input())
    n = int(input())

    arr_0 = list(range(1,n+1))
    for k in range(k):
        for i in range(1,n):
            arr_0[i] += arr_0[i-1]

    print(arr_0[-1])
