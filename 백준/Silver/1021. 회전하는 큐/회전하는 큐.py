from collections import deque

listLen, check = map(int,input().split())
checkList = list(map(int,input().split()))
originalList = [_ for _ in range(1,listLen+1)]
originalList = deque(originalList)

rst = 0
for i in checkList:
    while True:
        if i == originalList[0]:
            originalList.popleft()
            break
        else:
            if originalList.index(i) >= len(originalList)/2:
                originalList.appendleft(originalList.pop())
                rst += 1
            else:
                originalList.append(originalList.popleft())
                rst+=1
print(rst)