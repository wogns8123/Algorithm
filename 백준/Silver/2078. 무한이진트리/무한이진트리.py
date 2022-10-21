L, R = map(int, input().split())

L_count = 0
R_count = 0

while (L != 1 and R != 1):
    if L < R:
        R_count += R // L
        R %= L

    elif L > R:
        L_count += L // R
        L %= R
L_count += L -1
R_count += R - 1

print(L_count, R_count)
