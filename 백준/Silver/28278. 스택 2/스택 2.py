import sys
input = sys.stdin.readline

n = int(input())
stack = []
for i in range(n):
    command = input().rstrip()

    if len(command) > 2:
        stack.append(int(command[2:]))
    elif command == '2':
        if stack:
            print(stack.pop())
        else:
            print(-1)
    elif command == '3':
        print(len(stack))
    elif command == '4':
        print(1 if len(stack) == 0 else 0)
    elif command =='5':
        if stack:
            print(stack[-1])
        else:
            print(-1)
