C,R =map(int,input().split())
my_seat = int(input())
arr = [[0]*C for _ in range(R)]
if my_seat > C*R:
    print(0)
    exit()
dx = [0,1,0,-1]
dy = [-1,0,1,0]
direction = x = y = 0
for number in range(1,C*R+1):
    if number == my_seat:
        print(y+1,x+1)
        break
    else:
        arr[x][y] = my_seat
        x += dx[direction]
        y += dy[direction]
        if x<0 or x>=R or y<0 or y>=C or arr[x][y]:
            x -= dx[direction]
            y -= dy[direction]

            direction = (direction+1)%4
            x += dx[direction]
            y += dy[direction]