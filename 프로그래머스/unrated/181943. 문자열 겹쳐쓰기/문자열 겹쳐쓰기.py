def solution(my_str,over_str, s):
    answer = my_str[:s] + over_str + my_str[s+len(over_str):]
    return answer