def bfs(start_i,start_j):
    visited = [[0]*N for _ in range(N)]
    que = []
    que.append((start_i,start_j))
    arr[start_i][start_j] = 0
    count = 1
    while que:
        node = que.pop(0)
        for di, dj in [[0, 1], [1, 0], [0, -1], [-1, 0]]:  # 동, 남,서,북
            ri, rj = node[0] + di, node[1] + dj
            if 0 <= ri < N and 0 <= rj < N and arr[ri][rj] == '1':
                arr[ri][rj] =0
                count +=1
                que.append((ri, rj))
    return count


N = int(input())
arr = [list(input()) for _ in range(N)]
count = []
for i in range(N):
    for j in range(N):
        if arr[i][j] == '1':
            count.append(bfs(i,j))
count.sort()
print(len(count))
for i in count:
    print(i)




