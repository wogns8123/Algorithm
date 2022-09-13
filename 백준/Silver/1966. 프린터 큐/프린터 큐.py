test = int(input())
for test_Case in range(test):
    num, check = map(int,input().split())
    arr = list(map(int,input().split()))
    count = 0
    check_list = [0]*num
    check_list[check] = 1

    while True:
        if arr[0] == max(arr):
            count += 1
            if check_list[0] == 1:
                print(count)
                break
            else:
                arr.pop(0)
                check_list.pop(0)

        else:
            arr.append(arr.pop(0))
            check_list.append(check_list.pop(0))



# if check의 위치가 0이고 가장 큰 수 일때!