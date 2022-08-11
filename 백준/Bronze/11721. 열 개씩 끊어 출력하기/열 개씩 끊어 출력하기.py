a = list(input())
# BaekjoonOnlineJudge이면... 19
for i in range(len(a)):   
    if i%10==0:
        print(''.join(a[i:i+10]))