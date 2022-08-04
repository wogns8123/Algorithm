a,b = map(str,input().split())
a_10 = 0
b_10 = 0
result_10 = 0

for i in range(len(a)):
    a_10 += int(a[i])*2**(len(a)-i-1)
for i in range(len(b)):
    b_10 += int(b[i])*2**(len(b)-i-1)
result_10 = a_10 + b_10
print(bin(result_10)[2:])
