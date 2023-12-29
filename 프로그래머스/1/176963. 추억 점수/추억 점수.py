def solution(name, yearning, photo):
    diction = {}
    rst = []
    for i in range(len(name)):
        diction[name[i]] = yearning[i]

    for arr in range(len(photo)):
        score = 0
        for h in range(len(photo[arr])):
            if photo[arr][h] in name:
                score += diction[photo[arr][h]]
        rst.append(score)

    return rst