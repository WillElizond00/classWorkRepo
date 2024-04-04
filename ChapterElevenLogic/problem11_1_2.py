# Problem 11_1_2.py
# William Elizondo
# April 4, 2024
# Python 3.12
# Windows 10
# Program to convert units from imperial to Metric
# 
# User Requirements:
# 1- Convert inches to centimeters
#    cm = inches * 2.54
# 2- Convert Feet to Meters
#    meters = feet * 0.03048
# 3- Convert miles to kilometers
#    km = miles * 1.6
#
# Main menu
def main ():
    next = True
    while next:
        print("\t\tMain Menu")
        print("\t\t" + (chr(126) * 6) + "\n")
        print("\t\t1 - Convert Inches to Centimeters")
        print("\t\t2 - Convert Feet to Meters")
        print("\t\t3 - Convert Miles to Kilometers\n")
        print("\t\t4 - Quit\n")

        # Prompt the user for a choice
        menuChoice = input("\t\tEnter your Selection or Q to Quit : ")
        
       # Validate user selection
        while menuChoice >= "1" or menuChoice <= "3" or menuChoice.upper() == "Q":
            if menuChoice == "1":
                inchesToCM()
                break
            elif menuChoice == "2":
                feetToMeters()
                break
            elif menuChoice == "3":
                milesToKM()
                break
            elif menuChoice.upper() == "Q":
                next = False
                break





def inchesToCM():
    print("Convert Inches to Centimeters")
    inches = input("Inches to convert : ")
    cm = float(inches) * 2.54
    print(inches, "Inches is equal to ", cm, " Centimeters")

def feetToMeters():
    print("Convert Feet to Meters")
    feet = input("Feet to convert : ")
    mt = float(feet) * 0.3048
    print(feet, "Feet is equal to ", mt , " Meters")
def milesToKM():
    print("Convert Miles to Kilometers")

main()