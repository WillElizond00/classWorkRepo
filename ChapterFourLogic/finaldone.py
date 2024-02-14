# A software company sells a package that retails for $99. Quantity discounts are given according to
# the following table:
# Quantity Discount
# 10–19 20%
# 20–49 30%
# 50–99 40%
# 100 or more 50%
# Design a program that asks the user to enter the number of packages purchased. The program
# should then display the amount of the discount (if any) and the total amount of the purchase after the
# discount.
packPrice = 99
print("How many packs have you purchased? Tell me!")
packsPurchased = int(input())
if packsPurchased >= 100:
    purchase = packsPurchased * packPrice * 0.5
    print("your purchase price is :" + " " + str(purchase))
else:
    if packsPurchased <= 99:
        if packsPurchased >= 50:
            purchase = packsPurchased * packPrice * 0.4
            print("your purchase price is :" + " " + str(purchase))
        else:
            if packsPurchased <= 49:
                if packsPurchased >= 20:
                    purchase = packsPurchased * packPrice * 0.3
                    print("your purchase price is :" + " " + str(purchase))
                else:
                    if packsPurchased <= 19:
                        if packsPurchased >= 10:
                            purchase = packsPurchased * packPrice * 0.2
                            print("your purchase price is :" + " " + str(purchase))
\