def solution(num_list):
    rst = 1
    if len(num_list) >= 11:
        rst = sum(num_list)
    else:
        for i in num_list:
            rst *= i
    return rst