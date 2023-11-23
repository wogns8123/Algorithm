def solution(myString, pat):
    rst = ''
    for i in myString:
        if i == 'A':
            rst += 'B'
        else:
            rst += 'A'
    if pat in rst:
        answer = 1
    else: 
        answer = 0
    return answer