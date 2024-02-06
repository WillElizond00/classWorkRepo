# GradeBook2.py
# William ELizondo 
# 02/06/2024
# Python 3.12
# Windows 10
#
# Convert a score to a grade
# 90 and above - A
# 80 - 89 - B
# 70 - 79 - C
# 60 - 69 - D
# Below 60 - False
# 
# 1 - Prompt user for test score 
testScore = float(input("Please enter a percentage score : "))
# 2 - Determine the grade
grade = ""
if testScore >= 90 :
    grade = "[ A ]"
elif testScore >= 80:
    grade = "[ B ]"
elif testScore >= 70:
    grade = "[ C ]"
elif testScore >= 60:
    grade = "[ D ]"
else:
    grade = "[ F ]"             

# Output result
    
print(testScore, " is ", grade)

