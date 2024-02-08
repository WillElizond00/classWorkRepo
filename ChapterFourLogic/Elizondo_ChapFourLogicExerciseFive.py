# William ELizondo   
# 2/8/2024
# Chapter 4 Exercise 5
#
# Design a program that prompts the user to enter the name of the two primary colors to mix. If the user enters anything other than "red", "blue", or "yellow" the program should display an error message. Otherwise the program should display the name of the secondary color that results.
# First color to mix
print("Enter your first color to mix!")
firstColor = input()

# second color to mix
print("Enter your second color to mix!")
secondColor = input()

# making sure the inputs are valid before mixing colors
if firstColor == "red" or firstColor == "blue" or firstColor == "yellow" and secondColor == "red" or secondColor == "blue" or secondColor == "yellow":
    
    # mixing colors
    # mixing purple
    if firstColor == "red" and secondColor == "blue" or firstColor == "blue" and secondColor == "red":
        mixColor = "purple"
    else:
        
        # mixing orange
        if firstColor == "red" and secondColor == "yellow" or secondColor == "red" and firstColor == "yellow":
            mixColor = "orange"
        else:
            
            # mixing green
            if firstColor == "blue" and secondColor == "yellow" or firstColor == "yellow" and secondColor == "blue":
                mixColor = "green"
            else:
                print("error")
    
    # end result
    print(firstColor + " combined with " + secondColor + " equal " + mixColor)
else:
    print("error")
