def solution(my_string, letter):
    s = ""
    for i in my_string:
        if i != letter:
            s += i
    return s