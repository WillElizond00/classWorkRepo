income = float(input("Enter the annual income: "))

if income < 85528:
	tax = income * 0.18 - 556.02
	print("1")
# Write the rest of your code here.
else:
    surplus = income - 85528
    tax = 14839.02 + (surplus * 0.32)
    print("2")

if tax < 0:
    tax = 0
    
tax = round(tax, 0)
print("The tax is:", tax, "thalers")
