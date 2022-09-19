s = input()
result = []
for i in s:
    if i in ['A', 'B', 'C']:
        result.append(2)
    elif i in ['D', 'E', 'F']:
        result.append(3)
    elif i in ['G', 'H', 'I']:
        result.append(4)
    elif i in ['J', 'K', 'L']:
        result.append(5)
    elif i in ['M', 'N', 'O']:
        result.append(6)
    elif i in ['P', 'Q', 'R', 'S']:
        result.append(7)
    elif i in ['T', 'U', 'V']:
        result.append(8)
    elif i in ['W', 'X', 'Y', 'Z']:
        result.append(9)

print(len(s) + sum(result))
