# Logic Chapter Nine Exercise Seven
# William Elizondo
#
# Design an application that has an array of at least 20 integers. It should call a module that uses the sequential search algorithm to locate one of the values.
# The module should keep a count of the number of comparisons it makes until it finds the value. Then the program should call another module 
# that uses the binary search algorithm to locate the same value. It should also keep a count of the number of comparisons it makes. Display these values on screen

# Your array
array = [2, 4, 3, 5, 6, 7, 1, 8, 9, 11, 12, 17, 20, 16, 13, 15, 18, 19, 14, 10]

#Sequential search function
def sequential_search(array, target):
    comparisons = 0  # Initialize the number of comparisons to 0
    for i in range(len(array)):
        comparisons += 1  # Increment the number of comparisons
        if array[i] == target:
            return i, comparisons  # Return index and number of comparisons if found
    return -1, comparisons  # Return -1 and number of comparisons if not found

def binary_search(sorted_array, target):
    left, right = 0, len(sorted_array) - 1
    comparisons = 0
    while left <= right:
        comparisons += 1
        mid = (left + right) // 2
        if sorted_array[mid] == target:
            return mid, comparisons
        elif sorted_array[mid] < target:
            left = mid + 1
        else:
            right = mid - 1
    return -1, comparisons

# Sort the array for binary search
array.sort()

# Choose a target value to search for
target_value = 10

# Perform sequential search on the sorted array
seq_comparisons = sequential_search(array, target_value)
print(f"Sequential Search Comparisons: {seq_comparisons}")

# Perform binary search
bin_comparisons = binary_search(array, target_value)
print(f"Binary Search Comparisons: {bin_comparisons}")