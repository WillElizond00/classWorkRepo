#InsertionSort.py

# The insertion_sort function performs an insertion sort
# algorithm on a list of integers.
#

arrToSort = [5,9,2,1,4,6,8,3,7,0]

def insertion_sort(arr):
    # Set index to 1 for the outer loop since the element 0 is already sorted
    index = 1

    print("I N S E R T I O N - S O R T")
    print(" ")
    print("Starting Array: ", arr)
    print(" ")
    print("Swap as long as SORTED > unsorted")
    print(" ")
    print("Index/Scan", "\t\t(Compare/Swap)", "\t\t Results")


    # The outer loop steps the index variable through
    # each subscript in the list, starting at 1. This
    # is because element 0 is considered already sorted.
    while index < len(arr): # Traverse the Array
        # The first element outside the sorted subset is
        # arr[index]. Assign the value of this element 
        # to unsorted_value
        unsorted_value = arr[index]

        # Start the scan variable at the subscript of the 
        # first element outside the sorted subset.
        scan = index

        print("Outside Index ", index,"\t\t(",arr[scan],")\t\t", arr)

        # Move the first element outside the sorted subset
        # into its proper position within the sorted subset.
        # Evaluate with each element in the sorted set
        while scan > 0 and arr[scan - 1] > unsorted_value: # Validation
            print("Swap - Scan : ",scan,"\t\t(",arr[scan-1]," - ",arr[scan],")\t\t",arr)
            arr[scan] = arr[scan - 1]
            scan = scan - 1

        # Insert the unsorted value in its proper position
        # within the sorted subset.
        arr[scan] = unsorted_value #Swap

        # increment index.
        index = index + 1 
        input("Any key to continue")
    print("Final Array: ", arr)

insertion_sort(arrToSort)