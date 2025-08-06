def isPrime(n):
    if n < 2:
        return False
    
    for i in range(2, int(n/2) + 1):
        if n % i == 0:
            return False
        
    return True

def printPrimes(n):
    for i in range(0, n):
        if isPrime(i):
            print(i)

printPrimes(100000)