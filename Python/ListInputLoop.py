# List Input Loop
# William ELizondo 
# Problem 8.1
# Create a list to hold the number of hours 
# worked by each employee
#
# 1- initialize a list to collect hours, total, average, highestHrs
hours = [0] * 10
totalHrs = 0.0
averageHrs = 0.0
highestHrs = 0.0
goOn = True
count = 1

# 2-Prompt user for hours worked
print(hours)
while (goOn and count <= len(hours)):
    hours[count] = int(input("Please enter hours worked : or 999 to quit : "))
    # if 999 then quit and reset input
    if hours[count] == 999:
        goOn = False
        hours[count] = 0
    # calculate highest hours
    if hours[count] > highestHrs:
        highestHrs = hours[count]

    totalHrs = totalHrs + hours[count]  
    if count >= 1:
        averageHrs = totalHrs / (count-1)

    print(count, totalHrs, averageHrs)
    input("Any key")
    count = count + 1  
# 3- Calculate total, average, highestHrs 
    
# 4- Output result 
print(hours)
print(len(hours))
print(totalHrs)
print(averageHrs)
print(highestHrs)
