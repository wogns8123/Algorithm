def solution(arr, queries):
    check = []
    for i in queries:
        temp = []
        for j in arr[i[0]:i[1]+1]:
            if j>i[2]:
                temp.append(j)

        if temp == []:
            check.append(-1)
        else:
            check.append(min(temp))
    return check