tc = int(input())
for _ in range(tc):
    num, s = input().split()
    arr=[]
    for i in s:
        arr.append(i*int(num))
    print(''.join(arr))