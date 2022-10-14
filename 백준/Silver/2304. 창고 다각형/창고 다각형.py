n = int(input())
arr = [0] * 1001
max_h = 0
max_index = 0
end_index = 0
for _ in range(n):
    idx, h = map(int,input().split())
    arr[idx] = h
    if max_h < h:
        max_h = h
        max_index = idx
    end_index = max(end_index, idx)

stack = []
answer = 0
for i in range(max_index+1):
    if not stack:
        stack.append(arr[i])
        answer += stack[-1]
    else:
        if stack[-1] < arr[i]:
            stack.pop()
            stack.append(arr[i])
        answer += stack[-1]

stack2 = []
for i in range(end_index,max_index,-1):
    if not stack2:
        stack2.append(arr[i])
        answer += stack2[-1]
    else:
        if stack2[-1] < arr[i]:
            stack2.pop()
            stack2.append(arr[i])
        answer += stack2[-1]
print(answer)