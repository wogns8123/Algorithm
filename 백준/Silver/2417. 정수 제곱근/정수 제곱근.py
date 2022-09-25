s = 0
n = int(input())
e = n
while s<=e:
    mid = (s+e)//2
    if mid**2<n:
        s = mid+1
    else:
        e = mid-1
print(s)
