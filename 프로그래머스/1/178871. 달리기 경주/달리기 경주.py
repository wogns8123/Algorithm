def solution(players, callings):
    p = {players : i for i, players in enumerate(players)} # 등수 : 사람이름
    for i in callings:
        num = p[i] # 등수
        p[i] -= 1 # 등수 -1
        p[players[num-1]] += 1 # 앞사람 등수 + 1
        players[num], players[num-1] = players[num-1], players[num]
    return players