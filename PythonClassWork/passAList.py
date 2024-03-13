#  PassAlist.py
# William Elizondo 
# 03/06/2024
# 
# pass a list as an argument to a function 
def main():
    # create a list
    numbers = [2, 4, 6, 8, 10]
    print(numbers)

    # get the sum of the elements
    print("Total is : ", getTotal(numbers))

# function to total numbers in a list 
def getTotal(valueList):
    # create a variable as an accumulator
    total = 0 

    #Calculate the total of a list 
    for num in valueList:
        total += num 

    #Return the total     
    return total 





main()
