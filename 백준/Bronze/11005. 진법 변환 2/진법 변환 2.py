check, grade = map(int,input().split())
number = '0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ'
result = ''
while check:
    result += str(number[check%grade])
    check //= grade
print(result[::-1])