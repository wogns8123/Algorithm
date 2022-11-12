import sys

n = int(input())
arr = list(map(int,input().split()))

check = arr.pop(0)
for i in range(n-1):
    count = 1
    check2 = check
    if check2 % arr[i] == 0:
        print(f'{check2//arr[i]}/{count}')
    else:
        while check % arr[i] != 0:
            count += 1
            check2 += check
            if check2 % arr[i] == 0:
                print(f'{check2 // arr[i]}/{count}')
                break




