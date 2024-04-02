# FileRead2.py
# This program will read the philosophers.txt file
#
# Import the os library path
import os.path 
# 1a - validation of file existing

if (os.path.exists('philosophers.txt')):
    # 1- Open philosopher.txt in Read Mode
    inFile = open('philosophers.txt', 'r') # Open in read mode
else:
    print("File Does not Exist")
    inFile = open('philosophers.txt', 'w') # Open in write mode
# 2- Process FileRead
# Create 4 variables to hold the read data
line1 = inFile.readline()
line2 = inFile.readline()
line3 = inFile.readline()
line4 = inFile.readline()
line5 = inFile.readline()
line6 = inFile.readline()
line7 = inFile.readline()

line1 = line1.rstrip('\n')
line2 = line2.rstrip('\n')
line3 = line3.rstrip('\n')

# 3- Close file
inFile.close()

print(line1)
print(line2)
print(line3)
print(line4)
print(line5)
print(line6)
print(line7)

