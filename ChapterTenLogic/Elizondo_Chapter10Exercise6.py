# William Elizondo
# Chapter 10 Logic Excerise 6

outFile = open('golf.dat', 'w') # Open a file named golf.dat 
# make a list for scores and names 
names = []
scores = []
# A counter for the loop
count = 1

while count >= 1: # my while loop to add the names and scores for each player
    # Prompt the user for the names and scores of each player
    namez1 = input("Please enter name: ") 
    scorez1 = input("Please enter score: ")
    # Append each player the the names list and append scores to the score list
    names.append(namez1)
    scores.append(scorez1)       
    print("Names", names)
    print("score: ", scores)
    # A break for the list to finish all inputed names
    done = input("If finished press 1, to continue press 2: ")
    if done == "1":
        break

# Print the list of names and scores in the list
print("Names: ", names)
print("Scores: ", scores)



# Close the Outfile 
outFile.close