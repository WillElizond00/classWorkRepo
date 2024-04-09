# William ELizondo 
# Chapter 10 Logic Exercise 7 

# Read a file named golf.dat
import os.path


if(os.path.exists('golf.dat')):
    # 1 open 'golf.dat' in Read mode
    inFile = open('golf.dat', 'r')

    lowest_score = float('inf')
    lowest_score_name = ""

    for line in inFile:
        name, score = line.strip().split(',')
        score = int(score)

        if score < lowest_score:
            lowest_score = score
            lowest_score_name = name

        print(f"Name: {name}, Score: {score}")

    inFile.close()

    
    
    if lowest_score_name:
        print(f"Lowest score: {lowest_score_name} with a score of {lowest_score}")
    else:
        print("No scores found in the file.")


