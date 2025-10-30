def solution(dots):
    x = [x for x,y in dots]
    y = [y for x,y in dots]
    width = max(x) - min(x)
    height = max(y) - min(y)
    return width * height