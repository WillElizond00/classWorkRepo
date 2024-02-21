#Test Average and Grade
# Write a program that asks the user to enter five test scores. The program should display a letter grade
# for each score and the average test score. Design the following functions in the program:
# calcAverage —This function should accept five test scores as arguments and return the average
# of the scores.
# determineGrade —This function should accept a test score as an argument and return a letter
# grade for the score (as a String ), based on the following grading scale:
# Score Letter Grade
# 90–100 A
# 80–89 B
# 70–79 C
# 60–69 D
# Below 60 F

#ask the user to enter five test scores
testscore1 = float(input("Please enter score 1 : "))
testscore2 = float(input("Please enter score 2 : "))
testscore3 = float(input("Please enter score 3 : "))
testscore4 = float(input("Please enter score 4 : "))
testscore5 = float(input("Please enter score 5 : "))

#accept five test scores as arguments and return the average of the scores.
def calcAverage (sc1, sc2, sc3, sc4, sc5):
    total = sc1 + sc2 + sc3 + sc4 + sc5
    average = total / 5
    return average

# accept a test score as an argument and return a letter grade for the score ("As a string")
def determineGrade(testScore):
    if 100 > testScore >= 90: 
        return "A"
    elif 89 > testScore >= 80: 
        return "B"
    elif 79 > testScore >= 70:
        return "C"
    elif 69 > testScore >= 60:
        "D"
    else:
        return "F"

#print average score
print("Average score", calcAverage(testscore1,testscore2,testscore3,testscore4,testscore5))

#print grades
print("Test score grade 1: ", determineGrade(testscore1))
print("Test score grade 2: ", determineGrade(testscore2))
print("Test score grade 3: ", determineGrade(testscore3))
print("Test score grade 4: ", determineGrade(testscore4))
print("Test score grade 5: ", determineGrade(testscore5))
