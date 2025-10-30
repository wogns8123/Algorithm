def solution(picture, k):
    answer = []
    for row in picture:
        new_row = ""
        for ch in row:
            new_row += ch * k
        for _ in range(k):
            answer.append(new_row)
    return answer