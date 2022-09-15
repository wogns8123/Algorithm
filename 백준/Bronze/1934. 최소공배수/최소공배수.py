tc = int(input())
for test in range(tc):
    a, b =map(int,input().split())
    cal_a, cal_b = a, b

    while cal_b:
        cal_a = cal_a%cal_b
        cal_a, cal_b = cal_b, cal_a
    print(a*b//cal_a)
