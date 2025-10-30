def solution(bin1, bin2):
    answer = ''
    n1 = int(bin1, 2)
    n2 = int(bin2, 2)
    answer = bin(n1 + n2)[2:]
    return answer 