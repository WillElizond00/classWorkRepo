#Chapter Seven Logic Exercise Three
# William Elizondo 
# 02/27/2024
# Design a program that asks for the number of fat grams and calories in a food item. Validate the input
# as follows:
# Make sure the number of fat grams and calories is not less than 0.
# According to nutritional formulas, the number of calories cannot exceed Make sure
# that the number of calories entered is not greater than
# Once correct data has been entered, the program should calculate and display the percentage of
# calories that come from fat. Use the following formula:
# Some nutritionists classify a food as “low fat” if less than 30 percent of its calories come from fat. If
# the results of this formula are less than 0.3, the program should display a message indicating the food
# is low in fat
#
# 1- calculate the percentage of calories from the fat 
#
fat_grams = float(input("Enter the number of fat grams: "))
#prompt user for the number of calories
calories = float(input("Enter the number of calories: "))

# Step 2: Validate the input
while fat_grams < 0:
    print("The number of fat grams cannot be less than 0. Please re-enter:")
    fat_grams = float(input("Enter the number of fat grams: "))


# validate the input for calories
while calories < 0: 
    print("The number of calories cannot be less than 0. Please re-enter:")
    calories = float(input("Enter the number of calories: "))