num1 = int(input())
num2 = int(input())
num3 = int(input())

mul_num = num1*num2*num3
arr = list(str(mul_num))

for i in range(10):
    print(arr.count(f'{i}'))