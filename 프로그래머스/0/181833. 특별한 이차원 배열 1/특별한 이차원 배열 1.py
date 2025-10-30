def solution(n):
    
    arr = [[0 for _ in range(n)] for __ in range(n)]
    for i in range(n):
        for j in range(n):
            if i == j:
                arr[i][j] = 1
    return arr