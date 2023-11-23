def solution(my_string, is_suffix):
    lst = []
    for i in range(len(my_string)+1):
        lst.append(my_string[i:])
        if is_suffix in lst:
            answer = 1
        else:
            answer = 0
    return answer