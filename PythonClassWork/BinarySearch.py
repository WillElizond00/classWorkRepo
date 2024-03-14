#Program 9-4 Binary search



# The binary search  function perfoms a binary search on a 
# string list. The list is searched for the string passed to 
# the value parameter. If the string is found, its subscript
# is returned. Otherwise, -1 is returned indicating the value 
# was not found in the list. 


def binary_search(arr, value):
    # Set the initial values.
    first = 0
    last = len(arr)- 1
    position = -1 # found position
    found = False

    # Search for the value
    while not found and first <= last:
        # Calculate the mid point.
        middle = int((first + last)/ 2)

        # If the value is found at the mid point...
        if (arr[middle]) == value:
            found = True
            position = middle
        # else if value is in the lower half...
        elif arr[middle] > value:
            last = middle - 1
        # else if value is in the upper half...
        else:
            first = middle + 1

    #Return the position of the item, or -1
    # if it was not found
    return position

def main():
    myArray = ["0","10","20","30","40","50","60","70","80", "90", "99"]
    myArray2 = ["10","0","30","80","20","70","60","50","80", "90", "99"]
    
    print(myArray2)
    myArray2.sort()
    print(myArray2)
    pos = input("Enter a number to search for: ")
    a = binary_search(myArray2, pos)
    print(pos, " is found at position "  , a)

main()