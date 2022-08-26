# import sys
# sys.stdin = open('input.txt')
num = int(input())
arr = list(map(int,input().split()))
count = 1
max_count = 1
for i in range(len(arr)-1):
    if arr[i] <= arr[i+1]:
        count+=1
    else:
        count = 1
    if count > max_count:
        max_count = count
count = 1
for i in range(len(arr)-1):
    if arr[i] >= arr[i+1]:
        count+=1
    else:
        count = 1
    if count > max_count:
        max_count = count

print(max_count)