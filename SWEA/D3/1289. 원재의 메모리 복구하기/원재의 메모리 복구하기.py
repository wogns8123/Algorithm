tc = int(input())
for test in range(tc):
    s = list(input())
    arr = ['0']*len(s)
    count = 0
    for i in range(len(s)):
        if s[i] == '1': 
            if arr[i] =='0':
                arr[i:] = ['1']*len(arr[i:])
                count += 1
        elif s[i] == '0':
            if arr[i] == '1':
                arr[i:] = ['0'] * len(arr[i:])
                count +=1

    print(f'#{test+1} {count}')