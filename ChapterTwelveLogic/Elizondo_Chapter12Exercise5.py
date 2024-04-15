# William Elizondo
# Logic Chapter 12 Exercise 5
#
# Design a program that prompts the user to enter a string, and displays the character that appears 
# most frequently in the string.

# Prompt the user to enter a string 

userInput = input("Enter your string here : ")

userInput = "".join(userInput.split())

my_counter = {}
for letter in userInput:
    if letter in my_counter:
        my_counter[letter] += 1
    else:
        my_counter[letter] = 1

max_key = max(my_counter, key=my_counter.get)


print(f"Character : {max_key} has highest frequency of : {my_counter[max_key]}")