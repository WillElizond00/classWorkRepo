# William Elizondo
# Chapter 10 Logic Excerise 6

# Read a file named golf.dat
import os.path


if(os.path.exists('golf.dat')):
    # 1 open 'golf.dat' in Read mode
    inFile = open('golf.dat', 'r')

    for line in inFile:
        name, score = line.strip().split(',')
        print(f"Name: {name}, Score: {score}")

    inFile.close()
else:
    print("File not found: golf.dat")