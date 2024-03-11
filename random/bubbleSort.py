# Program 9 - 1 (bubble _sort.py)
# Note: This is not a complete program.
#
# The bubble_sort function uses the bubble sort algorithm
# to sort a list of integers.
# (1) We dont have to pass the array size because we can use the len function.
# (2) We do not have a separate method to swap values.
# The swap is performed inside this method.


def bubble_sort(arr):
    # Set max_element to the length of the arr list, minus
    # one. This is necessary for the outer loop.
    max_element = len(arr) - 1 # passes
    
    # The outer loop positions max_element at the last element 
    # to compare during each pass through the list. Initially
    # max_element is the index of the last element in the array.
    # During each iteration, it is decreased by one.
    while max_element >= 0: # Outer loop
        # Set index to 0, necessary for the inner loop.
        index = 0

        #The inner loop steps through the list, comparing
        # each element with it's neighbor. All of the elements
        # from index 0 through max_element are involved in the 
        # comparison. If two elements are out of order, they are
        # swapped.
        while index <= max_element - 1: # Inner Loop
            # Compare an element with it's neighbor
            if arr[index] > arr[index + 1]: # swap
            # Swap the two elements.
                temp = arr[index]
                arr[index] = arr[index + 1]
                arr[index - 1] = temp
            #Increment index.
        index = index + 1
    # Decrement max_element (Separte sorted & unsorted)
    max_element = max_element - 1