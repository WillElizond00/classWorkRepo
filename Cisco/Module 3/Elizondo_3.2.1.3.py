secret_number = 777

print(
"""
+================================+
| Welcome to my game, muggle!    |
| Enter an integer number        |
| and guess what number I've     |
| picked for you.                |
| So, what is the secret number? |
+================================+
""")

# Prompt the user to enter an integer number.
askUser = int(input("Enter a integer: "))

# Write a while loop and the rest of your code.
while secret_number == secret_number:
    #Stuck in a loop if they don't guess the write number
    if askUser != secret_number:
        print("Haha you're stuck in an infinite loop")
        askUser = int(input("Enter a integer: "))
    #if askUser guesses correctly it ends the loop and they're free
    if askUser == secret_number:
        print("Well done muggle! You are free now.")
        break