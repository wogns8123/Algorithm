def solution(money):
    answer = []
    ice = 5500
    answer.append(money//ice)
    answer.append(money%ice)
    return answer