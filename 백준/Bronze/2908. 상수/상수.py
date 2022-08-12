a, b = map(str,input().split())

sang_a = a[::-1]
sang_b = b[::-1]
if int(sang_a) > int(sang_b):
    print(sang_a)
else:
    print(sang_b)