while True:
    n = int(input())
    if n == 0:
        break
    arr = [0,0] + [1] * 2*(n+1)
    prime = []

    for i in range(2,2*n+1):
        if arr[i]:
            prime.append(i)
            for j in range(2*i,2*n+1,i):
                arr[j] = 0

    for q in range(len(prime)):
        if prime[q] > n:
            prime = prime[q:]
            break
    print(len(prime))

