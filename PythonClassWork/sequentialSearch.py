# SequentialSearch.py
# William Elizondo
# March 06 2024
# Create and search for a score from a list
# Create a list for scores
scores = [87, 100, 75, 98, 82, 72, 100, 88, 92, 60, 66, 100, 22]
indexNo = [0,1,2,3,4,5,6,7,8,9,10,11,12]
myString = " "

#create variables
found = False
count = 0
foundAt = 0
scoresLength = len(scores)
indexNoLength = len(indexNo)

# prompt the user for a score 
myString = input("Enter a score to find : ")

while count < scoresLength:
  
    if scores[count] == int(myString):
        found = True
        foundAt = count 
        print(indexNo[count])
        print("You have scored", myString, "At", str(foundAt), "position")

    count += 1
input("Any Key ")
