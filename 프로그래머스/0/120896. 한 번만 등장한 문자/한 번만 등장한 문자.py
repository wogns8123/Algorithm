from collections import Counter 

def solution(s):
    answer = ''
    cnt = Counter(s)
    lst = []
    for k,v in cnt.items():
        if v == 1:
            lst.append(k)
    lst.sort()
    
    return ''.join(lst)