def solution(number):
    cnt =0
    for i in range(len(number)-2):
        for j in range(i+1,len(number)-1):
            for h in range(j+1, len(number)):
                if number[i] + number[j] + number[h] == 0:
                    cnt +=1
    return cnt