# William Elizondo
# Logic Chapter 12 Exercise 5
#
# Design a program that prompts the user to enter a string, and displays the character that appears 
# most frequently in the string.

# Prompt the user to enter a string 
print("Enter a string please ")

userInput = input("Enter your string here : ")

char_frequency = {}
for char in userInput:
    if char in char_frequency:
        char_frequency[char] += 1
    else:
        char_frequency[char] += 1


