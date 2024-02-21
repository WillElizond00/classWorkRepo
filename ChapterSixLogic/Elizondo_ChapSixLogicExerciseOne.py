# Chapter 6 Logic Exercise 1 
# William Elizondo
# 02/21/2024
#
# The area of a rectangle is calculated according to the following formula:
#
# Area = Width X Length
#
# Design a function that accepts a rectangle’s width and length as arguments and returns the
# rectangle’s area. Use the function in a program that prompts the user to enter the rectangle’s width
# and length, and then displays the rectangle’s area.
#
#


# Designing the function for area 
def rect (w, l):
    return w * l

#Prompt the user to enter the rectangles width and length
width = int(input("Please enter a width : "))
length = int(input("Please enter a length : "))

#display the rectangles area
area = rect(width, length)
print(f"The area of the rectangle is: {area}")