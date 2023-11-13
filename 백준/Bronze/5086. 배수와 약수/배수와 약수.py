

while True:
    n, m = map(int, input().split())
    if n == 0 and m == 0:
        break
    else:
        if n%m ==0 and n>m:
            print('multiple')
        elif m%n ==0 and n<m:
            print('factor')
        else:
            print('neither')
