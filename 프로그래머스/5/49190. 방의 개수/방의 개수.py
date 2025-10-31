def solution(arrows):
    dx = [0, 1, 1, 1, 0, -1, -1, -1]
    dy = [1, 1, 0, -1, -1, -1, 0, 1]
    
    visited_point = set()
    visited_line = set()
    
    x, y = 0, 0
    visited_point.add((x,y))
    count = 0
    for arrow in arrows:
        for _ in range(2):
            nx, ny = x + dx[arrow], y + dy[arrow]
            
            line = ((x,y), (nx, ny))
            reversed_line = ((nx,ny), (x,y))
            
            if (nx,ny) in visited_point and line not in visited_line:
                count += 1
            visited_point.add((nx,ny))
            visited_line.add(line)
            visited_line.add(reversed_line)
        
            x,y = nx, ny
    return count