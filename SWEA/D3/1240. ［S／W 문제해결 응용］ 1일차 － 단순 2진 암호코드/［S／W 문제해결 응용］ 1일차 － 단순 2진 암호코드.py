tc = int(input())
for test in range(tc):
    N, M = map(int, input().split())
    arr = [input() for _ in range(N)]

    dic = {
        '0001101': 0,
        '0011001': 1,
        '0010011': 2,
        '0111101': 3,
        '0100011': 4,
        '0110001': 5,
        '0101111': 6,
        '0111011': 7,
        '0110111': 8,
        '0001011': 9,
    }
    start = 0
    for i in range(N):
        if '1' in arr[i]:
            start = i
            break

    end = M
    for i in range(M-1, 0, -1):
        if arr[start][i] == '1':
            end = i
            break
    text = arr[start][end-55:end+1]
    result = []
    for i in range(0,56,7):
        a = text[i:i+7]
        result.append(dic[a])
    result2 = []        # 짝수 저장
    result3 = []        # 홀수 저장
    for i in range(len(result)):
        if (i+1)%2 == 0:
            result2.append(result[i])
        else:
            result3.append(result[i])

    if (sum(result3)*3 + sum(result2)) % 10 == 0:
        print(f'#{test+1} {sum(result)}')
    else:
        print(f'#{test+1} 0')