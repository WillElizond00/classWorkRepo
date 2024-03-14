# Logic Chapter 9 Exercise 2
# William ELizondo
# 
# Design a program that allows the user to enter 20 names into a string array. Sort the array in ascending (alphbetical) order and display it's contents.
#
# String array that will store the 20 names
array = []
# A while loop that stops the program when 20 names have been entered.
while len(array) < 20:
# Ask user to enter names 
    user_input = input(f" {array} Enter a name : ")
 # Append user input into the array
    array.append(user_input)
    # Check if user_input is a number which would be invalid
    if user_input.isdigit():
        print("Please enter a name and not numbers")
        #Skip over the iteration if the name entered is a number
        continue

#Sort the array in alphabetical order
array.sort()

#print out the length of the array to see the amount of items in  it
print(len(array))
#print out the items in the array so we can see exactly what's in it 
print(array)
