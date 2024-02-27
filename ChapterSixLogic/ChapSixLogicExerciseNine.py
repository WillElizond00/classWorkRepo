#
# Guess the Number
# Design a number guessing game program. The program should generate a random number and then
# ask the user to guess the number. Each time the user enters his or her guess, the program should
# indicate whether it was too high or too low. The game is over when the user correctly guesses the
# number. When the game ends, the program should display the number of guesses that the user made
#
#
#
import random
#generate a random number to be guessed between 1 - 100
numberToBeGuessed = random.randint(1, 100)

guesses = 0

while True:
#Ask user to guess what the number is
    userGuess = int(input("Enter what you think the number is "))
    #increment guesses each time a guess is made 
    guesses += 1
#check if correct or too low or too high
    if userGuess == numberToBeGuessed:
        print("You got it! Congrats!")
        break
    elif userGuess > numberToBeGuessed:
        print("Number is too high")
    elif userGuess < numberToBeGuessed:
        print("Number too low")

#print amount of guesses taken
print(f"You guessed the number in {guesses} tries!")