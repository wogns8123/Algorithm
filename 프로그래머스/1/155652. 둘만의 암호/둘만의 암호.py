def solution(s, skip, index):
    alpha = 'abcdefghijklmnopqrstuvwxyz'
    rst = ''
    n = 0

    for i in skip:
        alpha = alpha.replace(i, "")

    for i in s:
        rst += alpha[(alpha.index(i) + index)%len(alpha)]
    return rst