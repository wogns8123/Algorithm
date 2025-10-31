from collections import deque
def solution(numbers, target):
    
    queue = deque()
    queue.append((0,0)) # 현재 합, 인덱스
    count = 0
    
    while queue:
        current_sum, idx = queue.popleft()
        if idx == len(numbers):
            if target == current_sum:
                count += 1
        else:
            queue.append((current_sum+numbers[idx], idx+1))
            queue.append((current_sum-numbers[idx], idx+1))
        
    return count