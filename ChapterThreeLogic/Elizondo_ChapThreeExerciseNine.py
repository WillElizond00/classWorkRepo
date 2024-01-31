# Paint Job Estimator
# A painting company has determined that for every 115 square feet of wall space, one gallon of paint
# and eight hours of labor will be required. The company charges $20.00 per hour for labor. Design a
# modular program that asks the user to enter the square feet of wall space to be painted and the price
# of the paint per gallon. The program should display the following data:
# The number of gallons of paint required
# The hours of labor required
# The cost of the paint
# The labor charges
# The total cost of the paint job

print("Enter the square feet of wall space needed to be painted")

# getting squarefeet
squareFeet = float(input())
print("Now enter the paint price")

# getting paint price
paintPrice = float(input())

# calculating gallons of paint
gallonsOfPaint = squareFeet / 115

# getting our labor hours
laborHours = gallonsOfPaint * 8

# Calculating paintCost
paintCost = gallonsOfPaint * paintPrice

# calculating the labor charges ($20 per hour)
laborCharges = laborHours * 20.0

# calculate the total cost of the paint job
totalCost = paintCost + laborCharges

# output all the costs
print("Gallons of paint required:" + str(gallonsOfPaint))
print("Hours of labor required:" + str(laborHours))
print("Cost of the paint: $" + str(paintCost))
print("Labor charges: $" + str(laborCharges))
print("Total cost of the paint job: $" + str(totalCost))
