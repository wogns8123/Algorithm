def solution(left, right):
    answer = 0
    # 약수 개수 함수
    def getdiv(n):
        arr = []
        for i in range(1, int(n**(1/2))+1):
            if n % i == 0:
                arr.append(i)
                if i ** 2 != n:
                    arr.append(n//i)
        return len(arr)

    for i in range(left, right+1):
        if getdiv(i)%2==0:
            answer += i
        else:
            answer -= i
    return answer