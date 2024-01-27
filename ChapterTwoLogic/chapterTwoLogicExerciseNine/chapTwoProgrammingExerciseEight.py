
#variables
#Tip percent
tip = .15
#tax percent
tax = 0.07
# food total
foodTotal = 0
#question
print("How much are they charging for your food?")
#Give price for food
foodTotal = int(input())
#tip amount
tipAmount = foodTotal * tip
#tax amount
taxAmount = foodTotal * tax
#total
total = foodTotal + tipAmount + taxAmount

print("This is the total of the food alone " + str(foodTotal))

print("This is your tip amount " + str(tipAmount))

print("This is your tax amount " + str(taxAmount))

print("This is your total for everything " + str(total))