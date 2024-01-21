def solution(myString, pat):
    my_string_2 = myString.lower()
    is_prefix_2 = pat.lower()

    if is_prefix_2 in my_string_2:
        return 1
    else:
        return 0