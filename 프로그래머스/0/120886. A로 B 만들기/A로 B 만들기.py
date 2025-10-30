def solution(before, after):
    answer = 0
    lst1 = sorted(list(before))
    lst2 = sorted(list(after))
    if(lst1 == lst2):
        answer = 1
    
    return answer