


# 4. Total Purchase
# A customer in a store is purchasing five items. 
# Design a program that asks for the price of each item, 
# and then displays the subtotal of the sale, the amount 
# of sales tax, and the total. Assume the sales tax is 6 percent.



#variables
salesTax = 0
total = 0
#all items
firstItem = 0
secondItem = 0
thirdItem = 0
fourthItem = 0
fifthItem = 0
#tax rate
tax = 0.06

#get price for first item   
print("What's is the price for the first item?")
firstItem = int(input())

#get price for second item  
print("What's the price of the second item")
secondItem = int(input())

#get price for third item
print("What's the price of the third item")
thirdItem = int(input())

#get price for fourth item
print("What's the price of the fourth item")
fourthItem = int(input())

#get price for fifth item
print("What's the price of the fifth item")
fifthItem = int(input())

#determine subtotal
subtotal = firstItem + secondItem + thirdItem + fourthItem + fifthItem


#calculate salesTax and total
salesTax = subtotal * tax
total = salesTax + subtotal

print("The subtotal is " + str(subtotal))

print("The sales tax is " + str(salesTax))

print("The total is " + str(total))
