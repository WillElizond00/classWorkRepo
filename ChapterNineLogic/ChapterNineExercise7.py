# Define a list of integers for testing our search algorithm
arrList = [10,30,20,40,60,50,70,80]


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
    return found

def binary_search(arr, target):
    # Make a copy of the array and sort it for the binary search,
    sorted_arr = arr.copy()
    sorted_arr.sort()
    found = False
    comparisons = 0
    start_position = 0
    end_position = len(sorted_arr) # Corrected to include to the last item in search


    # Perform binary search 
    while not found:
        middle_position = int((end_position - start_position) / 2) 
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
print(binary_search(arrList, 20))