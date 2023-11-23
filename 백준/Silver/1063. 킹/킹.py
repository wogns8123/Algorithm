move = {'R': [1,0], 'L':[-1,0], 'B':[0,-1], 'T':[0,1], 'RB':[1,-1], 'RT':[1,1], 'LB':[-1,-1], 'LT':[-1,1]}

king, rock, num = input().split()
k = list(map(int, [ord(king[0]) - 64, king[1]]))
s = list(map(int, [ord(rock[0]) - 64, rock[1]]))
for _ in range(int(num)):
    direction = input()
    locationX = k[0] + move[direction][0]
    locationY = k[1] + move[direction][1]
    if 0< locationX <= 8 and 0 < locationY <=8:
        if locationX == s[0] and locationY == s[1]:
            sx = s[0] + move[direction][0]
            sy = s[1] + move[direction][1]
            if 0< sx <= 8 and 0< sy<=8:
                k = [locationX, locationY]
                s = [sx,sy]
        else:
            k = [locationX, locationY]

print(chr(k[0]+64),k[1],sep="")
print(chr(s[0]+64),s[1],sep="")
