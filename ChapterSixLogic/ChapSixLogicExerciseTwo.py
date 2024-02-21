# Chapter Six Exercise Two
# William Elizondo 
# 02/21/2024
#
# Feet to Inches
# One foot equals 12 inches. Design a function named feetToInches that accepts a number of feet
# as an argument, and returns the number of inches in that many feet. Use the function in a program
# that prompts the user to enter a number of feet and then displays the number of inches in that many
# feet.

# Design a function named feetToInches that accepts a number of feet as an argument and then returns the number of inches in that many feet
def feetToInches (feet):
    return feet * 12

# Get the number of feet from the user
numberOfFeet = int(input("How many feet are there?"))

#convert feet to inches 
inches = feetToInches(numberOfFeet)

print("The number of inches is", inches)