# Chapter 6 Logic Exercise Three
# William ELizondo
# 02/21/2024
# Design a program that gives simple math quizzes. The program should display two random numbers
# that are to be added, such as:
# 247
# + 129
# The program should allow the student to enter the answer. If the answer is correct, a message of
# congratulations should be displayed. If the answer is incorrect, a message showing the correct
# answer should be displayed
#
import random
#generate 2 random numbers 
num1 = random.randint(1, 300)
num2 = random.randint(1, 300)
#display addition problem with numbers 
print(f"  {num1}")
print(f"+ {num2}")
print("------")
#collecting user answer 
userAnswer = int(input("Enter your answer: "))
#defining the correct answer
correctAnswer = num1 + num2
#checking if userAnswer is correct
if userAnswer == correctAnswer:
    print("Congratulations!")
else :
    print(f"Sorry the correct answer is : {correctAnswer}")

