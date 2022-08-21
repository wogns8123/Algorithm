tc = int(input())
for test in range(tc):
    s = input()
    stack = []
    top = -1
    result = ''
    for i in s:
        if i == '(':
            stack.append(i)
            top += 1
        elif i == ')':
            if stack:
                stack.pop()
                top -= 1
            else:
                result = 'NO'
                break

    else:
        if not stack:
            result = 'YES'
        else:
            result = 'NO'
    print(result)
