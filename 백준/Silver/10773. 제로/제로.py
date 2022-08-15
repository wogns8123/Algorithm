import sys
tc = int(input())
arr = []
for test in range(tc):
    num = int(sys.stdin.readline())
    if num != 0:
        arr.append(int(num))
    elif num == 0:
        arr.pop()

print(sum(arr))
