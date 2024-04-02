# FileWrite.py
# This program will write 3 lines to a file
# William Elizondo
#
# Access Objects/Classes : 
# ClassName.objName.method()
# ClassName.objName.property
#
#1- Open FileWrite
#   Create an object to hold my file
outFile = open('philosophers.txt', 'a')
#2- Process Data
#   Write the names of 4 philosophers
outFile.write('William\n')
outFile.write('Jerry\n')
outFile.write('Jordan\n')
outFile.write('Chip\n')
#3- Close file
outFile.close()
