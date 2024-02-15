'''
Running on a particular treadmill you burn 3.9 calories per minute. Design a program that uses a loop
to display the number of calories burned after 10, 15, 20, 25, and 30 minutes


'''


caloriesPerMinute = 3.9
totalCalories = 0
minutes = 0

minutes = int(input("Enter the amount of minutes : "))

for calories in range(1, minutes):
    totalCalories = minutes * caloriesPerMinute 
    

print(totalCalories)