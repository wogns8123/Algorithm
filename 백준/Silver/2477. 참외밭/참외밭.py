fruit = int(input())
x = []
y = []
arr = []
for _ in range(6):
    direction, length = map(int,input().split())
    if direction == 1 or direction == 2:
        x.append(length)
        arr.append(length)
    else:
        y.append(length)
        arr.append(length)

a = arr.index(max(x))   # 최대 x의 위치
b = arr.index(max(y))   # 최대 y의 위치
small_x = abs(arr[b-1] - arr[(b-5 if b==5 else b+1)])
small_y = abs(arr[a-1] - arr[(a-5 if a==5 else a+1)])
big_box = max(x)*max(y)
small_box = small_x*small_y
print(fruit * (big_box - small_box))

