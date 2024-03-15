
# Initialize an empty list named 'array' to store the names entered by the user.
array = []

# Start a while loop to collect names until the 'array' list contains 20 items
while len(array) < 20:
# Prompt the user to enter a name and store the input in 'user_input'
    user_input = input("Enter a name : ")

    # Check if the input string consists only of digits using the isdigit() method.
    # The isdigit() method returns True if all characters in the string are digits.
    if user_input.isdigit():
        # If the input is all digits, inform the user to input names using letters only.
        print("Please only use letters for names")
        # Use 'continue' to skip the rest of the loop iteration and ask for input again.
        continue

# If the input passes the digit check, add it to the 'array' list.
    array.append(user_input)

# After collecting 20 names, sort the list in place in ascending (alphabetical) order.
array.sort()

# Print the sorted list of names.
print(array)

# Print the total number of names in the list to confirm it's 20.
print(len(array))