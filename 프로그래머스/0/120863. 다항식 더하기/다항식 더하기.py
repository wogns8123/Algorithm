def solution(polynomial):
    
    number = polynomial.split(" + ")
    x_sum = 0
    sum = 0
    for i in number:
        if i[-1] == 'x':
            if i == 'x':
                x_sum += 1
            else:
                x_sum += int(i[:-1])
        else:
            sum += int(i)
            
    result = []
    if x_sum != 0:
        result.append(f'{x_sum}x' if x_sum > 1 else 'x')
    if sum != 0:
        result.append(str(sum))
    return ' + '.join(result)