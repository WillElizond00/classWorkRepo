#Chapter Seven Logic Exercise Three
# William Elizondo 
# 02/27/2024
# Design a program that asks for the number of fat grams and calories in a food item. Validate the input
# as follows:
# Make sure the number of fat grams and calories is not less than 0.
# According to nutritional formulas, the number of calories cannot exceed fat grams * 9. Make sure
# that the number of calories entered is greater than fat grams * 9
# Once correct data has been entered, the program should calculate and display the percentage of
# calories that come from fat. Use the following formula:
<<<<<<< HEAD:ChapterSevenLogic/Elizondo_ChapterSevenLogicExerciseOne.py
#
#fatGrams * 9 / calories
#
=======

# percentage of calories from fat = (fatGrams * 9) / Calories


>>>>>>> 6094b0ba47aadfb2c2d6f1375849680b1b520667:ChapterSevenLogic/Elizondo.py
# Some nutritionists classify a food as “low fat” if less than 30 percent of its calories come from fat. If
# the results of this formula are less than 0.3, the program should display a message indicating the food
# is low in fat
#
<<<<<<< HEAD:ChapterSevenLogic/Elizondo_ChapterSevenLogicExerciseOne.py
#
#
=======
# 
#prompt the user for the number of fat grams
>>>>>>> 6094b0ba47aadfb2c2d6f1375849680b1b520667:ChapterSevenLogic/Elizondo.py
fat_grams = float(input("Enter the number of fat grams: "))

# Step 2: Validate the input for fat gram
while fat_grams < 0:
    print("The number of fat grams cannot be less than 0. Please re-enter:")
    fat_grams = float(input("Enter the number of fat grams: "))

#prompt user for the number of calories
calories = float(input("Enter the number of calories: "))

# step 2 validate the input for calories
while calories < 0: 
    print("The number of calories cannot be less than 0. Please re-enter:")
    calories = float(input("Enter the number of calories: "))

<<<<<<< HEAD:ChapterSevenLogic/Elizondo_ChapterSevenLogicExerciseOne.py
fattyness = fat_grams * 9 / calories

if fattyness < 0.3 :
    print("The percentage of the fattyness in this food is ", fattyness)
    print("This food is low in fat")
=======
# Calculate calories from fat grams
calories_from_fat = fat_grams * 9
#check if calories from fat exceed total calories 
if calories_from_fat < calories:
    print("Error: Calories from fat exceed total calories. Please check inputs.")
elif calories == 0:
    print("Error: Total calories cannot be 0 when calculating the percentage of calories from fat.")
else:
    #calculate the percentage of calories from fat
    percentage_of_calories_from_fat = (calories_from_fat / calories) * 100
    print(f"Percentage of calories from fat: {percentage_of_calories_from_fat:.2f}%")
    #check if the food is low in far percentage
    if percentage_of_calories_from_fat < 0.3:
        print("This food is considered to be low in fat")
    else:  
        print("This food is not considered low in fat")
>>>>>>> 6094b0ba47aadfb2c2d6f1375849680b1b520667:ChapterSevenLogic/Elizondo.py
