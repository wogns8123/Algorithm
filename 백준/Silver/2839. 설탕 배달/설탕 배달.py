num = int(input())
if num%5 == 0:
    print(num//5)
else:
    count = 0
    while num>0:
        num-=3
        count+=1
        if num%5 == 0:
            count += num//5
            print(count)
            break
        elif num == 1 or num ==2:
            print(-1)
            break
        elif num == 0:
            print(count)
            break