
#variables
a = 5
b = 2

#addition
def add(a):
    b = a + 2
    return b

add_it = add(a)

#multiplication
def multiply(b):
    a = b * 4
    return a 

multiply_it = multiply(b)

#division
def divide(a):
    b = a / 3.14 
    return b

divide_it = divide(a)

#subtraction
def subtract(b):
    a = b - 8
    return a

subtract_it = subtract(b)


print("B - 8 equals ", subtract_it)
print("A / 3.14 equals ",divide_it)
print("A + 2 equals ",add_it)
print("B * 4 equals ",multiply_it)