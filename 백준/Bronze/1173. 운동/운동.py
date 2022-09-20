import sys
N, m, M, T, R = map(int,input().split())
# N = 목표 운동
# m, M 최소, 최대
# T = 증가량
# R = 감소량
count = 0
time = 0
current = m

while count < N:
    if m + T > M:
        break
    if current+T<=M:
        current += T
        count += 1

    else:
        current = max(current-R,m)
    time += 1

if count == N:
    print(time)
else:
    print(-1)
