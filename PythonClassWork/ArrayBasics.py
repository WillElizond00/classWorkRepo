# ArrayBasics3.py
# William ELizondo
# March 4, 2024
# Experiment with Arrays - Lists
# 
# Python does not have Arrays
# List : sequence of variables
# Tuple : sequence of constants

# Define and initialize
nums = [0,1,2,3,4,5,6,7,8,9] # list
nums2 = (0,1,2,3,4,5,6,7,8,9) # tuple
nums3 = [0] * 10
names = ["William", "Jerry","Charles","Jordan", "Andres"] # list
names2 = [" " ] * 10

# 2D arrays - List
list2D = [[0] * 10] * 5 # 5 Rows 10 Columns
list2DS = [[""] * 10 ] * 3 # 3 Rows & 10 Columns each
list2DSM = [["R0C0", "R0C1", "R0C2"], ["R1C0","R1C1","R1C2"], ["R2C0","R2C1","R2C2"], ["R3C0","R3C1","R4C2"]] # 2D string list manually 

print(nums)
print(nums2)
print(names)
print(nums3)
print(names2)
# input("Any key to continue") # Debug
print(list2D)
print(list2DS)
print(list2DSM)
print(list2DSM[0][1])
# Length of a list 
# --------------------------- #
lenNums = len(nums)
print("Length of Nums : ", lenNums, "\nLength of Names : ",len(names))
# -------------------------------------------------------------------- #
for i in range(len(names)):
    print(names[i])
    
# -- Print 2D Arrays


print(list2DSM)
print("Number of rows", len(list2DSM)) # number of rows
print("Number of columns", len(list2DSM[3])) # number of Columns
for i in range(len(list2DSM)):
    print(list2DSM[i])

print("\nMy matrix with rows and columns")
print("-" * 45, "\n")

for x in range(len(list2DSM)): # Rows
    for y in range(len(list2DSM[x])):# Columns
        print(list2DSM[x][y]) 
    
    print("-" * 50)


