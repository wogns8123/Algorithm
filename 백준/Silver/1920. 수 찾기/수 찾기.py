num = int(input())
li = set(list(map(int, input().split())))

find_num = int(input())
find_li = list(map(int, input().split()))

for i in find_li:
    if i in li:
        print(1)
    else:
        print(0)