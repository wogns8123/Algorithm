n = int(input())
for _ in range(n):
    arr = list(map(str,input().split()))

    while True:
        womp = list(map(str,input().split()))

        while womp[2] in arr:
            arr.remove(womp[2])
        if womp == ['what', 'does', 'the', 'fox', 'say?']:
            break
    for i in arr:
        print(i, end=' ')


