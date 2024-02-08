# William Elizondo
# 2/8/2024
# Chapter 4 Exercise 9
#Shipping Charges
# The Fast Freight Shipping Company charges the following rates:
# Weight of Package Rate per Pound
# 2 pounds or less $1.10
# Over 2 pounds but not more than 6 pounds $2.20
# Over 6 pounds but not more than 10 pounds $3.70
# Over 10 pounds $3.80
# Design a program that asks the user to enter the weight of a package and then displays the shipping
# charges
#

#user inputs package weight
print("Enter the weight of the package")
packWeight = float(input())
#if packWeight less than 2 pounds than price is 1.10
if packWeight <= 2:
    price = 1.10 * packWeight
else:
    #if packWeight is less than 6 but more than 2 than price is 2.20
    if packWeight < 6:
        if packWeight > 2:
            price = 2.20 * packWeight
    else:
        #if packWeight is less than 10 but more than 6 than price is 3.70
        if packWeight < 10:
            if packWeight > 6:
                price = 3.70 * packWeight
        else:
            #if packWeight is more than 10 than price is 3.80
            if packWeight > 10:
                price = 3.80 * packWeight
print(price)
