arrList = [10,30,20,40,60,50,70,80,90,11,33,22,44,77,66,88,99,55,12,31]


def sequentialSearch(arr, target):
    pos = 0
    found = False
    comparisons = 0 # add the comparisons counter

    while pos < len(arr) and not found:
        comparisons += 1 # increment the counter here
        if arr[pos] == target:
            found = True
            print("We found what you're looking for")
            print("position is in : ,"pos)
        else: 
            pos = pos + 1
            print("else", pos)

    print(f"Number of comparisons: {comparisons}") # Print the number of comparisons
    return found




print(sequentialSearch(arrList, 55))