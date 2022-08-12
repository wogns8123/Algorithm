arr = list(map(int,input().split()))
# 8개 
result = 0

if arr == sorted(arr):
    print('ascending')
elif arr == sorted(arr, reverse=True):
    print('descending')
else:
    print('mixed')
