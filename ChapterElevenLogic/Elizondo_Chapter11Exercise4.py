# William ELizondo
# Chapter 11 Logic Exercise 4
# 
# Astronomy Helper
# Create an application that displays the following menu:
#
#       Select a Planet
#   1. Mercury
#   2. Venus
#   3. Earth
#   4. Mars
#   5. Exit the program
#   Enter your selection.
def main():
    next = True
    while next:
        print("\t\tSelect a Planet")
        print("\t1. Mercury")
        print("\t2. Venus")
        print("\t3. Earth")
        print("\t4. Mars")
        print("\t5. Exit the program")
        print("\tEnter your selection.")

        menuChoice = input("\tChoose between 1 through 5 : ")


        while menuChoice >= "1" or menuChoice <= "5":
            if menuChoice == "1":
                mercury()
                break
            elif menuChoice == "2":
                venus()
                break
            elif menuChoice == "3":
                earth()
                break
            elif menuChoice == "4":
                mars()
                break
            elif menuChoice == "5":
                next = False
                break
            else :
                break

def mercury():
    avgDisFromSun = "57.9 million kilometers" 
    mass = "3.31 * 10^23kg"
    surfaceTemp = "-173 to 430 degrees Celsius"
    print("\n")
    print("\t\tMercury")
    print("\tAverage distance from the sun is",avgDisFromSun)
    print("\tMass of mercury is", mass)
    print("\tSurface temperature is", surfaceTemp)

def venus():
    avgDisFromSun = "108.2 million kilometers"
    mass = "4.87 * 10^24kg"
    surfaceTemp = "472 degrees Celsius"
    print("\n")
    print("\t\tVenus")
    print("\tAverage distance from the sun is", avgDisFromSun)
    print("\tMass of Mercury is", mass)
    print("\tSurface temperature is",surfaceTemp)

def earth():
    avgDisFromSun = "149.6 million kilometers"
    mass = "5.967 X 10 ^24kg"
    surfaceTemp = "-50 to 50 degrees Celsius"
    print("\n")
    print("\t\tEarth")
    print("\tAverage distance from the sun is", avgDisFromSun)
    print("\tMass of Earth is", mass)
    print("\tSurface temperature is",surfaceTemp)

def mars():
    avgDisFromSun = "227.9 million kilometers"
    mass = "0.6424 X 10 ^24kg"
    surfaceTemp = "-140 to 20 degrees Celsius"
    print("\n")
    print("\t\tMars")
    print("\tAverage distance from the sun is", avgDisFromSun)
    print("\tMass of Mars is", mass)
    print("\tSurface temperature is",surfaceTemp)



main()