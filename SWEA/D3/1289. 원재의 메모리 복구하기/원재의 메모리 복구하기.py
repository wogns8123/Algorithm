tc = int(input())
for test in range(tc):
    arr = list(input())
    lst = ['0']*len(arr)  # 초기화

    count = 0
    for i in range(len(lst)):
        if lst[i] != arr[i]:
            count+=1
            if arr[i] == '1':
                lst[i:] = ['1']*len(lst[i:])
            else:
                lst[i:] = ['0']*len(lst[i:])

    print(f'#{test+1} {count}')
