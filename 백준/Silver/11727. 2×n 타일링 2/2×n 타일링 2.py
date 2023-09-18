num = int(input())

arr = [0] * 1002
arr[0] = 1
arr[1] = 3

for i in range(num):
    arr[i+2] = arr[i+1] + 2*arr[i]
if arr[num-1] > 10007:
    arr[num-1]%=10007
print(arr[num-1])