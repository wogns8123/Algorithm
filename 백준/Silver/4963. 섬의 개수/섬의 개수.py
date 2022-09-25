def bfs(i, j):
    que = []
    que.append((i, j))
    arr[i][j] = '0'
    count = 1
    while que:
        node = que.pop(0)
        for di, dj in [[0, 1], [1, 0], [0, -1], [-1, 0], [1, 1], [-1, 1], [1, -1], [-1, -1]]:  # 동, 남,서,북
            ri = node[0] + di
            rj = node[1] + dj
            if 0<=ri<h and 0<=rj<w and arr[ri][rj] == '1':
                que.append((ri,rj))
                arr[ri][rj] = '0'
                count +=1
    return count

while True:
    w, h = map(int, input().split())
    if (w, h) == (0, 0):
        break
    arr = [list(input().split()) for _ in range(h)]
    result =[]
    for i in range(h):
        for j in range(w):
            if arr[i][j] == '1':
                result.append(bfs(i,j))
    print(len(result))