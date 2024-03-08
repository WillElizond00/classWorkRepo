# Ask the user to enter a natural number and store it in the variable c0.
c0 = int(input("Enter c0: "))

# Ensure the entered number is a positive integer greater than 1, as required by the conjecture.
if c0 > 1:
    # Initialize a counter for the steps required to reach 1 according to the Collatz hypothesis.
    steps = 0
    
    # Loop as long as c0 does not equal 1, indicating the process is incomplete.
    while c0 != 1:
        # Check if the current value of c0 is odd using the modulo operator.
        if c0 % 2 != 0:
            # If c0 is odd, calculate the new value as 3 times c0 plus 1 and store it in cnew.
            cnew = 3 * c0 + 1
        else:
            # If c0 is even, calculate the new value as c0 divided by 2 and store it in cnew.
            cnew = c0 // 2
        
        # Update the value of c0 with the calculated new value stored in cnew.
        c0 = cnew
        
        # Print the current value of c0 before it gets updated.
        print(c0)
        
        # Increment the step counter after each iteration to track how many steps have been taken.
        steps += 1
    
    # After the loop completes (when c0 equals 1), print the total number of steps taken.
    print("steps =", steps)
else:
    # If the user inputs a number that is not greater than 1, output an error message.
    print("Bad c0 value")
