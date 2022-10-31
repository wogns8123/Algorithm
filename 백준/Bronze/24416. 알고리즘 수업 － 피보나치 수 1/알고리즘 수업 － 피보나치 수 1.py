def fib(n):
    fibo = [1,1]
    for i in range(2,n+1):
        fibo.append(fibo[i-1] + fibo[i-2])
    return fibo[n-1]

def fibonacci(n):
    global f
    f[1] = 1
    f[2] = 1
    count2 = 0
    for i in range(3, n+1):
        f[i] = f[i-1] + f[i-2]
        count2 += 1
    return count2

n = int(input())
f = [0]*(n+1)

print(fib(n),fibonacci(n))


