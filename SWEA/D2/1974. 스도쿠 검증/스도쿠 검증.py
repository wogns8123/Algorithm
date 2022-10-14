tc = int(input())
for test in range(tc):
    result = True
    arr = [list(map(int,input().split())) for _ in range(9)]
    sort_arr = [1, 2, 3, 4, 5, 6, 7, 8, 9]
    
    for i in range(9):
        # 가로
        x_arr = arr[i][::]
        x_arr.sort()
        if x_arr != sort_arr:
            result = False
        # print(x_arr)
    
        # 세로
        y_arr=[]
        for j in range(9):
            y_arr.append(arr[j][i])
        y_arr.sort()
        if y_arr != sort_arr:
            result = False
    
    
    space_arr = []
    for a in range(3):
        for b in range(3):
            space = []
            for q in range(3):
                for w in range(3):
                    space.append(arr[3*a+q][3*b+w])
            space.sort()
            if space != sort_arr:
                result = False
    if result == True:
        print(f'#{test+1} 1')
    else:
        print(f'#{test+1} 0')
    