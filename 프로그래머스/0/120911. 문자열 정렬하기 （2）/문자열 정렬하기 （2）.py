def solution(my_string):
    answer = ''
    my_string = my_string.lower()
    lst = list(my_string)
    
    lst.sort()
    
    return ''.join(lst)