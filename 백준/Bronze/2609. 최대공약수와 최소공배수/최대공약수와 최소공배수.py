a, b = map(int, input().split())
max_ = []

for i in range(1, min(a, b) + 1):
    if a % i == 0 and b % i == 0:
        max_.append(i)

print(max(max_))
print(max(max_) * (a // max(max_)) * (b // max(max_)))
