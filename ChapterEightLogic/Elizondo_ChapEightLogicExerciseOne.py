# Logic Eight Exercise One
# William Elizondo
#
# Design a program that asks the user to enter a store's sales for each day of the week.
# The amounts should be stored in an array. Use a loop to calculate the total sales for the week and display the result.



#Initialize an empty list to store daily sales
sales = []


#list of days for user-friendly prompts
days_of_the_week = ["Monday", "Tuesday", "Wednesday", "Thursday","Friday", "Saturday", "Sunday"]

# Loop through each day and ask for input
for day in days_of_the_week:
    # Ask the user to enter the sales for the day
    # We use float(input()) to convert the input string to a floating number
    daily_sales = float(input(f"Enter the sales for {day}: "))
    # Append the daily sales to the sales list
    sales.append(daily_sales)

# Initialize a variable to hold total sales
total_sales = 0 

# Loop through each element in the sales list and add it to the total
for daily_sales in sales:
    total_sales += daily_sales


#Display the result to the user
print(f"The total sales for the week is: ${total_sales:.2f}")