"""
William Elizondo
February 14 2024
Chapter 5 Logic Programming Exercise 7     

Average Rainfall
Design a program that uses nested loops to collect data and calculate the average rainfall over a period of years. 
The program should first ask for the number of years. The other loop will iterate once for each year. 
The inner loop will iterate twelve times, once for each month. Each iteration of the inner loop will ask the user for the inches of rainfall for that month. 
After all iterations, the program should display the number of months, the total inches of rainfall, and the average rainfall per month for the entire period.
"""
#variables initialized
numberOfMonths = 0
totalRainFall = 0
years = 0
    
 #prompt user for total number of years   
years = int(input("Please enter number of years "))
#outer loop iterates once per year inputted
for year in range (years):
#inner loop iterates 12 times
    for month in range (12):
        #each iteration asks the user for the inches of rainfall that month
        rainFall = float(input(f"Enter the rainfall for the year {year}, month {month}: "))
        #number of months are added each iteration
        numberOfMonths += 1
        #total rain is also added each iteration
        totalRainFall += rainFall
        
    #calculate the average rainfall
averageRainFall = totalRainFall / numberOfMonths

#output the number of months, total rain and average rainfall
print("Number of months:", numberOfMonths)
print("Total rainfall:", totalRainFall, "inches")
print("Average rainfall per month:", averageRainFall, "inches")
