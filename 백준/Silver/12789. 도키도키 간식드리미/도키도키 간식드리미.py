n = int(input())
arr = list(map(int,input().split()))
stack2 = []
target = 1
while arr:
    if target == arr[0]:
        target += 1
        arr.pop(0)
    else:
        stack2.append(arr.pop(0))
    while stack2:
        if stack2[-1] == target:
            stack2.pop()
            target+=1
        else:
            break
if len(stack2) == 0:
    print('Nice')
else:
    print('Sad')
