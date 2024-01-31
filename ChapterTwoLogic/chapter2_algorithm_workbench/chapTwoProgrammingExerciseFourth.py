salesTax = 0
total = 0
firstItem = 0
secondItem = 0
thirdItem = 0
fourthItem = 0
fifthItem = 0
tax = 0.06


print("What's is the price for the first item?")
firstItem = int(input())

print("What's the price of the second item")
secondItem = int(input())

print("What's the price of the third item")
thirdItem = int(input())

print("What's the price of the fourth item")
fourthItem = int(input())

print("What's the price of the fifth item")
fifthItem = int(input())


subtotal = firstItem + secondItem + thirdItem + fourthItem + fifthItem

print(subtotal)
salesTax = subtotal * tax
total = salesTax + subtotal

print(salesTax)

print(total)
