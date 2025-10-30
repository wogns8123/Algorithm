def solution(strArr):
    answer = 0
    len_count = {}
    for s in strArr:
        l = len(s)
        if (l in len_count):
            len_count[l] += 1
        else:
            len_count[l] = 1
    return max(len_count.values())