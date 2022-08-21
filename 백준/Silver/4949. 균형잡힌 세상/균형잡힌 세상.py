while True:
    s = input()
    stack = []
    top = -1
    result = ''
    if s == '.':
        break
    for i in s:
        if i == '(' or i == '[':
            stack.append(i)
            top += 1
        elif i == ')':
            if len(stack) != 0 and stack[-1] == '(':
                stack.pop()
                top -= 1
            else:
                stack.append(i)
                break
        elif i == ']':
            if len(stack) != 0 and stack[-1] == '[':
                stack.pop()
                top -= 1
            else:
                stack.append(i)
                break
    if len(stack) == 0:
        result = 'yes'
    else:
        result = 'no'
    print(result)
