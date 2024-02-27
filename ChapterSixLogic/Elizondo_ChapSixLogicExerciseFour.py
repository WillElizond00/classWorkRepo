# Chapter 6 Logic Exercise 4 
# 02/21/2024
# William Elizondo
#
# Maximum of Two Values
# Design a function named max that accepts two integer values as arguments and returns the value
# that is the greater of the two. For example, if 7 and 12 are passed as arguments to the function, the
# function should return 12. Use the function in a program that prompts the user to enter two integer
# values. The program should display the value that is the greater of the two
#

#Design a function named max that accepts two integer values as arguments and returns the value that is the greater of the two

def max(int1, int2):
    #if int1 is bigger than int2 than return int1 as the max_value
    if int1 > int2:
        return(int1)
    #if else than return int2 as the max_value
    else:
        return(int2)
#prompt the user to enter two integer values.
firstInput = int(input("Input first value "))
secondInput = int(input("Input second value "))
#display the value that is the greater of the two
greaterValue = max(firstInput, secondInput)
print("The greater value is: ", greaterValue)