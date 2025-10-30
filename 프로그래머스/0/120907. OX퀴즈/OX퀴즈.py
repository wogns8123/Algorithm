def solution(quiz):
    result = []
    for problem in quiz:
        s_problem, answer = problem.split("=")
        
        
        if eval(s_problem) == int(answer):
            result+=["O"]
        else:
            result+= ["X"]
        
    return result