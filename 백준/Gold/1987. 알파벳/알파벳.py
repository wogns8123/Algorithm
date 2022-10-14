import sys

input = sys.stdin.readline
def dfs(x, y, cnt):
    global ans
    ans = max(ans, cnt)

    for i in range(4):
        tx = x + dx[i]
        ty = y + dy[i]
        if 0<=tx<r and 0<=ty<c and visited[board[tx][ty]] != 1:
            visited[board[tx][ty]] = 1
            dfs(tx, ty, cnt+1)
            visited[board[tx][ty]] = 0
dx = (-1, 0, 1, 0)
dy = (0, 1, 0, -1)
r, c = map(int, input().split())

board = [list(map(lambda x: ord(x)-65, input().rstrip())) for _ in range(r)]
visited = [0] * 26
ans = 0

visited[board[0][0]] = 1
dfs(0, 0, 1)
print(ans)
