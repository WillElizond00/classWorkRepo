'''
William Elizondo 
February 15, 2024
Logic Chapter 5 Programming Exercise 12

In mathematics, the notation n! represents the factorial of the nonnegative integer n. The factorial of n is the product of all the nonnegative integers from 1 up 
through n. For example : 
    7! = 1 X 2 X 3 X 4 X 5 X 6 X 7 = 5,040
and
    4! = 1 X 2 X 3 X 4 = 24
Design a program that asks the user to enter a nonnegative integer and then displays the factorial of that number
'''
#initialize factorial variable
myFact = 1

#ask the user to enter a nonnegative integer
number = int(input("Enter a nonnegative integer : "))

#use loop to calculate the factorial of input number
for i in range(1, number + 1):
    myFact *= i
  
    

#display the factorial of that number
print("Factorial is", myFact)
