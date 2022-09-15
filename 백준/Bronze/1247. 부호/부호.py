from sys import stdin

for _ in range(3):
    tc = int(stdin.readline())
    arr = []
    for i in range(tc):
        arr.append(int(stdin.readline()))
    if sum(arr)>0:
        print('+')
    elif sum(arr)==0:
        print(0)
    else:
        print('-')
