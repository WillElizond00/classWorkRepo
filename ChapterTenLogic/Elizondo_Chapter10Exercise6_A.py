# William Elizondo
# Chapter 10 Logic Excerise 6

# Open a file named golf.dat
outFile = open("golf.dat", "a")
# Prompt the user for the names and scores of each player 
names1 = input("Please enter a name: ")
score1 = input("Please enter score: ")

# Write to the file
outFile.write(names1 + ", ")
outFile.write(score1 + "\n") 

#Close the outFile
outFile.close
