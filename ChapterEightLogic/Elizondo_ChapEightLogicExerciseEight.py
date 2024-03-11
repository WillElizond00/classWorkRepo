# Chapter 8 Logic Exercise 8 
# William Elizondo
# 
# Design a program that uses the following parallel arrays:
# empId : an array of seven Integers to hold employee identification numbers. The array should be initialized with the following numbers:
# 56588 45201 78951 87775 84512 13028 75804
# hours: An array of seven Integers to hold the number of hours worked by each employee
# payRate: An array of seven Reals to hold each employee's hourly pay rate
# wages: An array of seven Reals to hold each employees gross wages
# The program should relate the data in each array through the subscripts. For example, the number in 
# element 0 of the hours array should be the number of hours worked by the employee whose 
# identification number is stored in element 0 of the empId array. The same employee's pay rate 
# should be stored in element 0 of the payRate array.
# The program should display each employee number and ask the user to enter that employee's hours
# and pay rate. It should then calculate the gross wages for that employee (hours times pay rate), which
# should be stored in the wages array. After the data has been entered for all the employees, the
# program should display each employee's identification number and gross wages.


# Initialize the empId array with given identification numbers
empId = [56588, 45201, 78951, 87775, 13028, 75804]

# Prepare empty lists for hours and payRate to be filled in by user input, 
# and wagees to be calculated.
hours = [0] * 7 # Initializes a list of 7 elements, all set to 0
payRate = [0.0] * 7 # Initializes a list of 7 elements , all set to 0.0
wages = [0.0] * 7 # Initializses a list of 7 elements, all set to 0.0

# Loop through each employee ID to collect hours worked and pay rate
for i in range(len(empId)):
    print(f"Employee ID {empId[i]}")
    # Collect hours worked, convert input to integer
    hours[i] = int(input("Enter hours worked: ")) # Collect hours and convert to integers
    # Collect hourly pay rate, convert input to float
    payRate[i] = float(input("Enter hourly pay rate: ")) # Collect pay rate, convert to float

# Calculate gross wages for each employee
for i in range(len(empId)):
    wages[i] = hours[i] * payRate[i] # Mutiply hours by pay rate for wages

# Display each employee's ID and gross wages
print("\nEmployee Wages:")
for i in range(len(empId)):
    print(f"Employee Id {empId[i]}: Gross Wages ${wages[i]:.2f}")