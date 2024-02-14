# Sample4_Lists
#
#

list1 = ["William","Jerry","Harris","Chip"] # list - variables
myTuple = ("William","Jerry","Harris","Chip") # tuple  - CONSTANT

print(list1[1])
print(myTuple[0])

for name1 in list1:
    print(name1)
for name2 in myTuple:
    print(name2)

list1[1] = "Christian" # change 1st element

for name1 in list1:
    print(name1)
for name2 in myTuple:
    print(name2)