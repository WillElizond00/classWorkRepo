#Chapter Seven Logic Exercise Three
# William Elizondo 
# 02/27/2024
# Design a program that asks for the number of fat grams and calories in a food item. Validate the input
# as follows:
# Make sure the number of fat grams and calories is not less than 0.
# According to nutritional formulas, the number of calories cannot exceed fat grams * 9. 
# Make sure
# that the number of calories entered is greater than fat grams * 9
# Once correct data has been entered, the program should calculate and display the percentage of
# calories that come from fat. Use the following formula:

# percentage of calories from fat = (fatGrams * 9) / Calories


# Some nutritionists classify a food as “low fat” if less than 30 percent of its calories come from fat. If
# the results of this formula are less than 0.3, the program should display a message indicating the food
# is low in fat
#
#Ask for number of fatGrams
fatGrams = float(input("Please enter the number of fat grams: "))

#Make sure fat grams is not less than 0
while fatGrams < 0:
    print("Grams of fat cannot be less than zero. Please enter a valid number: ")
    fatGrams= float(input("Please enter the number of fat grams: "))


#Ask for number of calories
calories = float(input("Please enter the number of calories: "))

#Make sure calories is not less than 0
while calories < 0:
    print("Calories cannot be less than zero. Please enter a valid number: ")
    calories = float(input("Please enter the number of calories"))

# Make sure number of calories is greater than fat grams * 9
while calories < fatGrams * 9:
    print("Calories must be greater than fat grams times 9. Please enter a valid number.")
    calories = float(input("Please enter the number of calories: "))

percentageOfCaloriesFromFat = fatGrams * 9 / calories * 100
print(f"Percentage of calories from fat: {percentageOfCaloriesFromFat:.2f}%")

if percentageOfCaloriesFromFat < 30:
    print("This food is considered to be low in fat.")
else:
    print("This food is not considered low in fat")