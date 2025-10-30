def solution(board):
    n = len(board)
    m = len(board[0])
    
    dx = [-1, -1, -1, 0, 0, 1, 1, 1]
    dy = [-1, 0, 1, -1, 1, -1, 0, 1]
    
    danger = [[0] * m for _ in range(n)]
    for i in range(n):
        for j in range(m):
            if board[i][j] == 1:
                danger[i][j] = 1
                for k in range(8):
                    ni = i + dx[k]
                    nj = j + dy[k]
                    if 0<= ni < n and 0<=nj < m:
                        danger[ni][nj] = 1
    safe = 0
    for i in range(n):
        for j in range(m):
            if danger[i][j] == 0:
                safe += 1
    
    return safe