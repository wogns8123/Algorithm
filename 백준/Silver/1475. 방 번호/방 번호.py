num = list(input())
count_list = [0] * 10
for i in num:
    if i == '6' or i == '9':
        count_list[6] += 1
    else:
        count_list[int(i)] += 1
if count_list[6] % 2 ==0:
    count_list[6] = count_list[6]//2
else:
    count_list[6] = count_list[6] // 2 + 1
print(max(count_list))