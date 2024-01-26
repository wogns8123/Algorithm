def solution(n):
    
    def getdiv(n):
        arr = []
        for i in range(1, int(n**(1/2))+1):
            if n % i == 0:
                arr.append(i)
                if i ** 2 != n:
                    arr.append(n//i)
        return arr
    return sum(getdiv(n))
    
    
    return answer