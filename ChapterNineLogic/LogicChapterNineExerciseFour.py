# Logic Chapter 9 Exercise 4
# William ELizondo
# 
# Modify the sorted names program that you wrote for exercise # 2 so it allows you to search the array for a specific name
#
# String array that will store the 20 names
array = []
# A while loop that stops the program when 20 names have been entered.
while len(array) < 20:
# Ask user to enter names 
    user_input = input("Enter a name : ")
 # Append user input into the array
    array.append(user_input)
    # Check if user_input is a number which would be invalid
    if user_input.isdigit():
        print("Please enter a name and not numbers")
        #Skip over the iteration if the name entered is a number
        continue

# Ask the user to search for the name they're looking for
search_name = input("Enter the name you're looking for : ")
# If it matches a name in the array it will display that it found it
if search_name in array:
    print(f"{search_name} is in the list!")
    #If not found it will tell you it's not there
else:
    print(f"{search_name} is not in the list.")




#Sort the array in alphabetical order
array.sort()

#print out the length of the array to see the amount of items in  it
print(len(array))
#print out the items in the array so we can see exactly what's in it 
print(array)