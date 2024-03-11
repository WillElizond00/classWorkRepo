# step 1: Create an empty list named "Beatles"
Beatles = []
print("Step 1:", Beatles)

# step 2: Use append() method to add the following members of the band to the list "John lennon", "Paul McCartney", 
# "George Harrsion"

Beatles.append("John Lennon")
Beatles.append("Paul McCartney")
Beatles.append("George Harrison")
print("Step 2:", Beatles)

# step 3: use a for loop and the append method to prompt the user to add the folllowing members to the band "Stu Sutcliffe"
# "Pete Best"
for members in range(2):
    Beatles.append(input("New band member: "))
print("Step 3:", Beatles)

# step 4: use the del instruction to remove Stu Sutcliffe and Pete Best from the list
del Beatles[-1]
del Beatles[-1]
print("Step 4:", Beatles)

# step 5: use the insert method to add Ring Starr to the beginning of the list
Beatles.insert(0, "RingoStarr")
print("Step 5:", Beatles)
print("The Fab:",len(Beatles))
