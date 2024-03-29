# Chapter 9 Exercise 7
# William Elizondo
#
# Design an application that has an array of at least 20 integers. It should call a module that use the 
# sequential search algorithm to locate one the values. The module should keep a count of the 
# number of comparisons it makes until it finds the value. Then the program should call another module
# that uses the binary search algorithm to locate the same value. It should also keep a count of the 
# number of comparisons it makes.Display these values on the screen. 



# Define a list of integers for testing our search algorithm
arrList = [5,6,1,3,2,4,7,8,9,0,10,12,14,13,17,15,16,18,19,20]


def sequentialSearch(arr, target):
    # Initialize variables: position, found flag, and comparison counter.
    pos = 0
    found = False
    comparisons = 0 # add the comparisons counter


    # Loop through the array until the target is found or the end is reached.
    while pos < len(arr) and not found:
        comparisons += 1 # increment the counter here
        if arr[pos] == target:
            found = True
            print("We found what you're looking for")
            print(f"position is in : ", {pos})
        else: 
            pos = pos + 1
            print("else", pos)

    # Print the total number of comparisons made.
    print(f"Number of comparisons: {comparisons}") # Print the number of comparisons
    print("Sequential search done.")
    return found

def binary_search(arr, target):
    # Make a copy of the array and sort it for the binary search,
    sorted_arr = []
    sorted_arr[:]= arr[:]
    sorted_arr.sort()
    found = False
    comparisons = 0
    start_position = 0
    end_position = len(sorted_arr) - 1 # Corrected to include to the last item in search

    # Perform binary search 
    while not found:
        middle_position = (end_position - start_position) // 2 + start_position
        comparisons += 1 # Increment comparisons counter.
        if sorted_arr[middle_position] == target:
            found = True
            print("We found what you're looking for")

            print(f"sorted position is in : ", {middle_position}) 
        else:
            if sorted_arr[middle_position] > target:
                # Adjust the end position if the target is less than the middle item.
                end_position = middle_position - 1 
            else:
                # Adjust the start position if the target is greater than the middle item.
                start_position = middle_position + 1

            if start_position > end_position:
                break  

    # Print the total number of comparisons made.
    print(f"Number of comparisons: {comparisons}")
    return found            



print(sequentialSearch(arrList, 20))
print(binary_search(arrList, 10))