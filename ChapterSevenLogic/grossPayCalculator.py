# Gross Pay Caluclator
# 02/27/2024
# William ELizondo
# Python 3.9 Windows 10
# Calculate the gross pay from hours and payrate
# 
#1- Prompt user for total hours 
hours = input("Please enter the total number of hours worked : ") # prime Read
#2- Prompt user for payrate
payRate = input("Please enter the payrate : ") # prime Read 

# replace "." with a null value
temp1 = hours.replace(".", "")
temp2 = payRate.replace(".", "")

while (not temp1.isnumeric() or not temp2.isnumeric()) : # Validation Loop
    print("Not Numeric")    
    #1- Prompt user for total hours 
    hours = input("Please enter the total number of hours worked : ") # prime Read
    #2- Prompt user for payrate
    payRate = input("Please enter the payrate : ") # prime Read 

    temp1 = hours.replace(".", "")
    temp2 = payRate.replace(".", "")

    

# Cast both variables to real 
hours = float(hours)
payRate = float(payRate)   
#3- Calculate the gross pay
grossPay = hours * payRate
#4- Output grosspay
print("Gross Pay : $ ", grossPay)
