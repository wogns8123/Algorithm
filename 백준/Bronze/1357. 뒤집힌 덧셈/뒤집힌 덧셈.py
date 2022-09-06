a, b = map(str,input().split())

reverse_a = a[::-1]
reverse_b = b[::-1]
result = int(reverse_a)+int(reverse_b)
reverse_result = str(result)
print(int(reverse_result[::-1]))

