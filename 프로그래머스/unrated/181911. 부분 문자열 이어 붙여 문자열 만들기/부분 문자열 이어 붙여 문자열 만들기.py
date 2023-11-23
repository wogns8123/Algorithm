def solution(arr, part):
    answer = ''
    for i in range(len(arr)):
        answer += arr[i][part[i][0]:part[i][1]+1]
    return answer