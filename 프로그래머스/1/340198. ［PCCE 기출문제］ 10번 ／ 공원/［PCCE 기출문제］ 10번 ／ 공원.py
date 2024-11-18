def check(mat, park, x, y):
    for i in range(x, x+mat):
        for j in range(y, y+mat):
            if i < len(park) and j < len(park[i]):
                if park[i][j] != '-1':
                    return False
            else:
                return False
    return True

def solution(mats, park):
    mats.sort(reverse=True)

    for mat in mats:
        for i in range(len(park)):
            for j in range(len(park[i])):
                if check(mat, park, i, j):
                    return mat
    return -1