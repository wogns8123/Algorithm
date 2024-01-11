from collections import Counter

def solution(weights):
    check = Counter(weights)
    answer = 0
    for i,j in check.items():
        if j>1:
            answer += j * (j-1) // 2

    weights= list(set(weights))
    for item in weights:
        for port in (1/2, 2/3, 3/4):
            if item * port in weights:
                answer += check[item] * check[item * port]
    
    return answer