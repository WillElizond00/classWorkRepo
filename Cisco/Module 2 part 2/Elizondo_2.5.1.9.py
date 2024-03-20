# William Elizondo
# 2.5.1.9 LAB: The Digit of Life
# 



# Prompt the user to enter their birthday in a specific format
date = input("Enter your birthday date (in the following format: YYYYMMDD or YYYYDDMM, 8 digits): ")

# Check if the input date is exactly 8 digits long and only contains digits
if len(date) != 8 or not date.isdigit():
    print("Invalid date format.") # Inform the user if the input doesn't meet the criteria
else:
    # Continue processing the date if it's in the correct format
    while len(date) > 1: # Keep looping as long as the date string has more than one digit 
        the_sum = 0 # Initialize a variable to keep the sum of the digits
        for dig in date: # Iterate through each digit in the date string
            the_sum += int(dig) # Convert each digit to an integer and add it to the sum
        print(date) # Print  the current state of the date before reducing it to the sum
        date = str(the_sum) # Convert the sum back to a string to continue the process
        
        # One the loop ends (when we have a single-digit sum), print the final result
    print("Your Digit of Life is: " + date)
