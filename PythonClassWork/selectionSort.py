
arrToSort = [5,9,2,1,4,0,8,3,7,6]

def selection_sort(arr):
    # Set start_scan to 0. This is necessary for 
    # the outer loop. It is the starting position
    # of the scan
    start_scan = 0

    # The outer loop iterates once for each element in the 
    # list. The start_scan variable marks the position where
    # the scan should be begin

    # Outside Loop
    while start_scan < len(arr) - 1:
    # Assume the first element in the scannable area
    # is the smallest value 
        min_index = start_scan
        min_value = arr[start_scan]


        print(min_index, min_value)
        input("Any key to continue - outer")

        # Initialize index for the inner loop
        index = start_scan + 1

        # Scan the list, starting at the 2nd element in
        # the scannable area. We are looking for the smallest
        # value in the scannable area.
        while index < len(arr):
            if arr[index] < min_value:
                min_value = arr[index]
                min_index = index
            print("index",index)
            input("Any key - inner")
        # Increment index.
            index = index + 1

        # swap the element with the smallest value
        # with the first element in the scannable area.
            arr[min_index] = arr[start_scan]
            arr[start_scan] = min_value
            input("Any key")


    # Increment start scan.
    start_scan = start_scan + 1

selection_sort(arrToSort)