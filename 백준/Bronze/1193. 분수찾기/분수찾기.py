num = int(input())
line = 0
while True:
    if num > line:
        num -= line
        line += 1
    else:
        break
x = list(range(1, line + 1))
y = list(range(1, line + 1))
if line % 2:
    print(f'{x[line - num]}/{y[num - 1]}')
else:
    print(f'{x[num - 1]}/{y[line - num]}')
