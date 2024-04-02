# AppendFile2.py
# William Elizondo
# This program will read the contents of philosophers.txt
# Store it in an Array (list) 
# Manipulate the list and then write it back to the philosophers.txt 

import os.path

myArraySize = 20
arrayNames = []

#arrayNames = [" "] * myArraySize 

#arrayNames[0] = "William"
#arrayNames[21] = "Jerry"

arrayNames.append("William")
arrayNames.append("Jerry")
print(arrayNames)
lineRead = "Line 1"

#1 Read the contents of the philosophers.txt to an array list
def openReadFile():
    if (os.path.exists("philosophers.txt")):
        inFile = open("philosophers.txt", "r")
        
        for i in range (myArraySize):
            lineRead = inFile.readline()
            lineRead = lineRead.rstrip("\n")
            arrayNames[i] = lineRead

        while lineRead2 > "":
            lineRead2 = inFile.readLine()
            arrayNames2.append(lineRead2)


openReadFile()
print(arrayNames)

