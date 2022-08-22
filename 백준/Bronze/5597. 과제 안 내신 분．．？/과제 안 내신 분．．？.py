arr = [i for i in range(1,31)]

for _ in range(28):
    temp = int(input())
    arr.remove(temp)

print(min(arr))
print(max(arr))
