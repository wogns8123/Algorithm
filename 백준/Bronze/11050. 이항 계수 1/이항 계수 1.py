num,num2 = map(int, input().split())

num_list = list(range(1, num+1))
num2_list = list(range(1,num2+1))

mul = 1
for i in range(num2):
    mul *= num_list[-i-1]
sub = 1
for i in range(num2):
    sub *= num2_list[i]
print(int(mul/sub))