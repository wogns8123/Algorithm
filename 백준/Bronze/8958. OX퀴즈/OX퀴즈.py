n = int(input())
for _ in range(n):

    s = list(input())
    count = 0
    count_list = []
    for i in s:
        if i == 'O':
            count +=1
            count_list.append(count)
        else:
            count = 0
    print(sum(count_list))