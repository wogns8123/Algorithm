def solution(park, routes):
    now = [0,0]
    # 시작 위치 파악 now값 구함
    for i in range(len(park)):
        for j in range(len(park[i])):
            if park[i][j] == 'S':
               now = [i, j]

    # 방향 값 정리
    for route in routes:
        x = now[1]
        y = now[0]
        for dis in range(int(route[2])):
            if route[0] == 'E' and x!=len(park[0])-1 and park[y][x+1] != 'X':
                x += 1
                if dis == int(route[2]) -1:
                    now[1] = x
            elif route[0] == 'W' and x!= 0 and park[y][x-1] != 'X':
                x -=1
                if dis == int(route[2])-1:
                    now[1] = x
            elif route[0] == 'S' and y!= len(park)-1 and park[y+1][x] != 'X':
                y+=1
                if dis == int(route[2])-1:
                    now[0] = y
            elif route[0] == 'N' and y!=0 and park[y-1][x] != 'X':
                y-=1
                if dis == int(route[2]) -1:
                    now[0] = y
    return now