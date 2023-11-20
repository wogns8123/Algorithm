n = int(input())
lst = []
for _ in range(2*n-1):
    inp = input()
    lst.append(inp)

result = "".join(lst).replace("/", "//")
print(eval(result))
