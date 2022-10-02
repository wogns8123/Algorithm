import sys

def f(i,k,r):
    count_a = 0
    count_b = 0
    if i == k:
        for i in p:
            if i in ['a','e','o','i','u']:
                count_a+=1
            else:
                count_b += 1
        if count_a>=1 and count_b>=2:
            print(''.join(p))
    else:
        for j in range(r,len(arr)):
            p[i] = arr[j]
            f(i+1,k,j+1)

L,C = map(int,input().split())
arr = sorted(input().split())
p = [None] * L
f(0,L,0)
