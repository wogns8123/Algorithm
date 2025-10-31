def solution(n, results):
    graph = [[0] * (n+1) for _ in range(n+1)]
    
    for winner, loser in results:
        graph[winner][loser] = 1
        
    # 간접 승리 정보
    for p in range(1, n+1):
        for q in range(1, n+1):
            for w in range(1, n+1):
                if graph[q][p] and graph[p][w]:
                    graph[q][w] = 1
                    
    answer = 0
    for i in range(1, n+1):
        count = 0
        for j in range(1, n+1):
            if i == j:
                continue
            if graph[i][j] or graph[j][i]:
                count += 1
        if count == n-1:
            answer += 1
    return answer