# Logic Eight Exercise One
# William Elizondo
#
#Number Analysis Program#
# Design a program that asks the user to enter a series of 20 numbers. The program should store the numbers in an array and then display the following data:
# The lowest number in the array
# The highest number in the array
# The total of numbers in the array
# The average of the numbers in the array


# Initialize an empty list to store the 20 numbers
stored_numbers = []

# Loop to ask the user to enter 20 numbers 
for i in range(20):
    # Ask for a number and convert it to the desired type, then append it to the list
    number = float(input(f"Enter number {i+1} of 20: "))
    stored_numbers.append(number)

# Find the lowest number in the list
lowest_number = min(stored_numbers)
# Find the highest number in the list
highest_number = max(stored_numbers)
# Calculate the total of the numbers in the list
total = sum(stored_numbers)
#Calculate the average of the numbers 
average = sum(stored_numbers) / len(stored_numbers)

# Display the lowest number
print(f"The lowest number in the array is: {lowest_number}")
# Display the highest number
print(f"The highest number in the array is: {highest_number}")
# Display the total
print(f"The total of the numbers in the array is: {total}")
# Display the average of the numbers
print(f"The average of the array is: {average}")