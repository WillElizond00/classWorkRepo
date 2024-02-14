# PenniesForPay.py
# William ELizondo
# Feb 13, 2024
#
#  Problem Statement
# Write a program to calculate the amount of money a person would make
# for a period of time, starting with 1 penny and doubling every day.
# User Req: / Algotrithm
# 1 - initialize variables
noOfDays = 0
salary = 0.0
rate = 1
# 2 - Prompt user for the number of days
noOfDays = int(input("Please enter the number of days in the period : ")) 
print("Pennies for Pay")
print("---------------")
print(noOfDays)
# 3 - calculate the salary per day - Cumulative for the total number of days 
for i in range (1, noOfDays + 1):
    salary += (0.01 * rate) # $0.01 per day
    rate = rate * 2 
    print("Day -",i,"Dollars : $", round(salary), "Rate : ", rate)
    #input("Any key to continue")
# 4 - Output the salary for each day with the total at the end in dollars 

print(round(salary))