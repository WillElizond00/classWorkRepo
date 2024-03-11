my_list = [1, 2, 4, 4, 1, 4, 2, 6, 2, 9]

# Create a new list that will store the unique elements from my_list.
unique_list = []

# Iterate through each element in the original list (my_list).
for element in my_list:
    # Check if the element is not already in unique_list.
    if element not in unique_list:
        # If the element is not in unique_list, add it to unique_list.
        unique_list.append(element)

# Now, we replace the original list with the unique_list to meet the assignment's requirement.
# This step is optional if you just need to print the unique elements.
# But since the goal is to have a list with unique elements, we do this assignment.
my_list = unique_list

# Print the statement required by the assignment.
print("The list with unique elements only:")
# Print the modified list, which now contains unique elements only.
print(my_list)
