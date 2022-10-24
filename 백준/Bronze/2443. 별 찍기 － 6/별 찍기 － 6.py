n = int(input())
s = ''
for i in range(n):
    s = s + (' ' * i)
    s = s + ((2*(n-i)-1)*'*')
    s = s+('\n')

print(s)