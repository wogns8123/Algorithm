def man(arr, number):
    for i in range(len(arr)):           # len(arr) = 8일때 -> i => 0~7
        if (i + 1) % number == 0:
            if arr[i] == 1:
                arr[i] = 0
            else:
                arr[i] = 1

def woman(arr, number):
    for i in range(len(arr)):            # len(arr) = 8일때 -> i => 0~7
        if 0 <= number-1 - i and number-1 + i < len(arr):
            if arr[number-1 - i] == arr[number-1 + i]:
                if arr[number-1 - i] == 1:
                    arr[number-1 - i], arr[number-1 + i] = 0, 0
                else:
                    arr[number-1 - i], arr[number-1 + i] = 1, 1
            else:
                break
        else:
            break

num = int(input())
arr = list(map(int, input().split()))
human = int(input())
for _ in range(human):
    gender, number = map(int, input().split())
    if gender == 1:
        man(arr, number)
    elif gender == 2:
        woman(arr, number)

for i in range(1,len(arr)+1):
    if i % 20 == 0:
        print(arr[i - 1])
    else:
        print(arr[i - 1], end=' ')