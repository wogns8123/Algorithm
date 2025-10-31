def solution(citations):
    citations.sort()
    n = len(citations)
    left, right = 0, n
    answer =0
    
    while left <= right:
        mid = (left + right) // 2
        count = 0
        for i in citations:
            if i>=mid:
                count += 1
        
        if count >= mid: 
            answer = mid
            left = mid +1
        else:
            right = mid-1
    return answer