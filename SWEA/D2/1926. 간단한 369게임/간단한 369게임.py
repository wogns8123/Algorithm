
def multiple3(n):
    n = str(n)
    ans = ''
    for i in range(len(n)):
        if int(n[i]) != 0:
            if int(n[i]) % 3==0:
                ans+='-'
    if ans=='':
        return n
    else:
        return ans
n = int(input())
arr = [i for i in range(1,n+1)]
ans = []
for i in range(len(arr)):
    ans.append(multiple3(arr[i]))
for i in ans:
    print(i,end=' ')
