def solution(answers):
    answer = []
    person1 = [1, 2, 3, 4, 5]
    person2 = [2, 1, 2, 3, 2, 4, 2, 5]
    person3 = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    
    length = len(answers)
    for i in [person1, person2, person3]:
        while len(i) < length:
            n= 2
            i *= n
            n+=1
    correct = []
    for i in [person1, person2, person3]:
        check = 0
        for j in range(length):
            if i[j] == answers[j]:
                check += 1
        correct.append(check)
    rst = []
    for i in range(len(correct)):
        if max(correct) == correct[i]:
            rst.append(i+1)
    return rst