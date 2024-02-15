"""
William Elizondo
Feburary 14 2024
Chapter 5 Logic Programming Exercise 7     

Average Rainfall
Design a program that uses nested loops to collect data and calculate the average rainfall over a period of years. 
The program should first ask for the number of years. The other loop will iterate once for each year. 
The inner loop will iterate twelve times, once for each month. Each iteration of the inner loop will ask the user for the inches of rainfall for that month. 
After all iterations, the program should display the number of months, the total inches of rainfall, and the average rainfall per month for the entire period.

1. prompt the user for the number of years
2. iterate for number of years total rainfall
3. iterate for 12 months total rainfall
4. output number of months, 
5. output total inches of rain fall
6. output average rainfall per month
"""
#variables
years = 0
numberOfMonths = 0
totalRainFall = 0
#prompt user for the number of years
years = int(input("Please enter the number of years "))
#iterate for number of years 
for year in range(years):
    #iterate for 12 months
    for month in range(12):
        #ask user to input how many inches of rain fall for that month
        rainFall = float(input(f"Please enter the rain for year {year}, month {month} "))
        numberOfMonths += 1
        totalRainFall += rainFall
        
#average of rainfall per month         
averageRainFall = totalRainFall / numberOfMonths

#output number of months
print("Number of months : ", numberOfMonths)
#output total inches of rainfall
print("Total inches of rainfall : ", totalRainFall)
#output average rainfall
print("Average rainfall : ", averageRainFall)
