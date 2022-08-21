a,b = input().split()
a_ = len(a)
b_ = len(b)

number_list = []
for i in range(b_ - a_ +1):
    count = 0
    for j in range(a_):
        if a[j] != b[i+j]:
            count+=1
    number_list.append(count)

min = number_list[0]
for i in number_list:
    if min > i:
        min = i
print(min)
