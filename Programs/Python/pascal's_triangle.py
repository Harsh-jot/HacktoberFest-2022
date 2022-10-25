# Given an integer N, return the first N rows of Pascal’s triangle.
from math import factorial

print('Enter N')
n=int(input())

for i in range(n):
    for j in range(n-i+1):

        print(end=" ")

    for j in range(i+1):
        print(factorial(i)//(factorial(j)*factorial(i-j)), end=" ") 
    print()
