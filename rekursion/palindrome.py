import numpy

def palindrome(array):
    if len(array) <= 1:
        return True
    elif (array[0] == array[-1]):
        return palindrome(array[1:-1])
    return False
    
print(palindrome([1,2,3,2,1]))