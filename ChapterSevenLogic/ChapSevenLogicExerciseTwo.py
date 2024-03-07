# Theater Seating Revenue with Input Validation
# A dramatic theater has three seating sections, and it charges the following prices for tickets in each
# section: section A seats cost $20 each, section B seats cost $15 each, and section C seats cost $10
# each. The theater has 300 seats in section A, 500 seats in section B, and 200 seats in section C.
# Design a program that asks for the number of tickets sold in each section and then displays the
# amount of income generated from ticket sales. The program should validate the numbers that are
# entered for each section.

#prices for tickets by section
SECTION_A_PRICE = 20
SECTION_B_PRICE = 15
SECTION_C_PRICE = 10

ticketsSoldForA = int(input("Please enter the number of tickets sold for section A : "))

while ticketsSoldForA < 0 or ticketsSoldForA > 300:
    print("Please select between 0 - 300 ")
    ticketsSoldForA = int(input("Please enter the number of tickets sold for section A : "))

ticketsSoldForB = int(input("Please enter the number of tickets sold for section B : "))

while ticketsSoldForB < 0 or ticketsSoldForB > 500:
    print("Please select between 0 - 500.")
    ticketsSoldForB = int(input("Please enter the number of tickets sold for section B : "))

ticketsSoldForC = int(input("Please enter the number of tickets sold for section C : "))

while ticketsSoldForC < 0 or ticketsSoldForC > 200:
    print("Please select between 0 - 200.")
    ticketsSoldForC = int(input("Please enter the number of tickets sold for section C : "))

totalAmountOfTicketsSold = ticketsSoldForA + ticketsSoldForB + ticketsSoldForC

totalMoneyMadeForA = ticketsSoldForA * SECTION_A_PRICE
totalMoneyMadeForB = ticketsSoldForB * SECTION_B_PRICE
totalMoneyMadeForC = ticketsSoldForC * SECTION_C_PRICE

totalPrice = totalMoneyMadeForA + totalMoneyMadeForB + totalMoneyMadeForC

print("Total amount of tickets sold", totalAmountOfTicketsSold)

print("Total price is", totalPrice)