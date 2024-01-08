from itertools import permutations

def solution(k, dungeons):
    check = list(permutations(dungeons))
    result = []

    for i in check:
        rst = 0
        stress = k
        for j in i:
            # i = 각 던전의 값
            if stress >= j[0]:
                stress-=j[1]
                rst += 1
        result.append(rst)
    return max(result)