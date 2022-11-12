arr =[]
for _ in range(5):
    arr.append(int(input()))

for i in range(5):
    if arr[i] < 40:
        arr[i] = 40

print(sum(arr)//5)