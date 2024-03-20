# William Elizondo
# 2.8.1.4 Reading ints safely
#
# Define a function named 'read_int' that takes a prompt message and a minimum and maximum range as parameters.
def read_int(prompt, min, max):
    # Initialize a boolean flag 'ok' to False to control the loop
    ok = False
    # Start a loop that continues until 'ok' is True
    while not ok:
        try:
            # Try to read an integer value from the user input based on the provided prompt.
            value = int(input(prompt))
            # If the input is successfully converted to an integer, set 'ok' to True.
            ok = True
        except ValueError:
            #If a ValueError occurs (e.g., non-integer input), print an error message.
            print("Error: wrong input")
        # Check if the input value is within the specified min and max range.    
        if ok:
            # Update 'ok' to True only if the value is within the range, otherwise False
            ok = value >= min and value <= max
        #If 'ok' is False after the range check, print an error message indicating the value is out of range.
        if not ok:
            print("Error: the value is not within permitted range (" + str(min) + ".." + str(max) + ")")
    # Return the validated integer value
    return value;

# Call the 'read_int' function with a prompt and range, storing the results in 'v'.
v = read_int("Enter a number from -10 to 10: ", -10, 10)

# Print the validated number
print("The number is:", v)