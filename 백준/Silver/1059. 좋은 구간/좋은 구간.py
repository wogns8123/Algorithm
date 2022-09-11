def solution():
    S = int(input())
    arr = list(map(int, input().split()))
    haveto = int(input())

    arr.sort()
    prev = 0
    for num in arr:
        min_val = 0
        max_val = 0
        if num == haveto:
            return 0
        if num > haveto:
            min_val = prev + 1
            max_val = num - 1
            break
        prev = num
    return (haveto - min_val) * (max_val - haveto + 1) + (max_val - haveto)
print(solution())
# if haveto in arr:
#     print(0)
# else:
#     min = 0
#     max = 0
#     for i in arr:
#         if i < haveto:
#             min = i
#         elif i > haveto and max == 0:
#             max = i
#     max -= 1
#     min += 1
#     print((haveto-min) + (max-haveto+1) + (max-haveto))
