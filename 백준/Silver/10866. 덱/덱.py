from collections import deque
import sys

n = int(sys.stdin.readline())
arr=deque()
for _ in range(n):
    s = list(sys.stdin.readline().split())


    if s[0] == 'push_back':
        arr.append(s[1])
    elif s[0] == 'push_front':
        arr.appendleft(s[1])
    elif s[0] == 'pop_front':
        if len(arr)>=1:
            print(arr.popleft())
        else:
            print(-1)
    elif s[0] == 'pop_back':
        if len(arr)>=1:
            print(arr.pop())
        else:
            print(-1)
    elif s[0] == 'size':
        print(len(arr))
    elif s[0] == 'empty':
        if len(arr)==0:
            print(1)
        else:
            print(0)
    elif s[0] == 'front':
        if len(arr)==0:
            print(-1)
        else:
            print(arr[0])
    elif s[0] == 'back':
        if len(arr)==0:
            print(-1)
        else:
            print(arr[-1])


