
def solution(balls, share):
    answer = 1

    balls_list = []
    # while len(balls_list) == share:

    for i in range(balls, 0, -1):
        if len(balls_list) == share:
            break
        else:
            balls_list.append(i)
    for i in balls_list:
        answer *= i

    answer_2 = 1
    share_list = []
    for i in range(share, 0, -1):
        if len(share_list) == share:
            break
        else:
            share_list.append(i)
    for i in share_list:
        answer_2 *= i
    return (answer// answer_2)