# Calculator
# William Elizondo
# Feburary 7th 2024
# Basic 4 function calculator 
#
repeat = True
while repeat:
    result = 0.0
    # Step 1- prompt user for a number
    num1 = float(input("Please enter a number : "))

    # Step 2- prompt user for a second number
    num2 = float(input("Please enter another number : "))

    # Step 3- prompt user for an operator
    operation = input("Please enter an operation : ")

    # Step 4- validate operation and get result 
    if operation ==  "+":
        result = num1 + num2
    elif operation == "-":
        result = num1 - num2
    elif operation == "*":
        result = num1 * num2
    elif operation == "/":
        result = num1 / num2    
    else:
        print("Invalid selection")
        repeat = False

    # Step 5- publish result
    if repeat:
        print(num1, operation, num2, " = ",result) 
