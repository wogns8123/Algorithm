n = int(input())
arr = list(map(int, input().split()))
count = 0

for i in arr:  # arr리스트 요소
    for j in range(2, i + 1):  # range(2,4)
        if i % j == 0:
            if i == j:
                count += 1
            break
print(count)
