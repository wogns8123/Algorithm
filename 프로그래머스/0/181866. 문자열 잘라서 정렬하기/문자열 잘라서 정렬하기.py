def solution(myString):
    answer = []
    check_list = [s for s in myString.split('x') if s]
    check_list.sort() 
    
    return check_list