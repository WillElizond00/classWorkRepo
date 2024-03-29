# RockPaperScissors.py
# Chandrakasan Iyar
# July 14, 2021
# Python Version 3.9
# Tested on Windows 10
####################################################
# (Problem Statement)
# Rock, Paper, Scissors Game 
# Design a program that lets the user play the game of Rock,
# Paper, Scissors against the computer. The program should
# work as follows:
####################################################
# (User Requirements)- becomes the Algorithm
# (1) When the program begins, a random number in the range 
#     of 1 through 3 is generated. If the number is 1, 
#     then the computer has chosen rock. If the number
#	  is 2, then the computer has chosen paper. 
#     If the number is 3, then the computer has chosen scissors.
#     (Don’t display the computer’s choice yet.)
# (2) The user enters his or her choice of “rock,” “paper,” or
#     “scissors” at the keyboard.
# (3) The computer’s choice is displayed.
# (4) The program should display a message indicating 
#     whether the user or the computer was the winner. 
# (5) Rules for winner
#
#     A winner is selected according to the following rules:
#	● If one player chooses rock and the other player chooses
#     scissors, then rock wins. 
#	  (The rock smashes the scissors.)
#   ● If one player chooses scissors and the other player 
#	  chooses paper, then scissors wins. 
#	  (Scissors cut paper.)
#	● If one player chooses paper and the other player 
#	  chooses rock, then paper wins. 
#	 (Paper wraps rock.)
# 	● If both players make the same choice, 
#	  the game must be played again to determine the winner.
#----------------------------------------------------------
import random 

#generate a random number between 1 and 3 
computer_choice = random.randint(1, 3)

#Ask user to make a choice
while True:
    user_input = input("Choose rock, paper, or scissors: ")

#convert the user choice to lower case to ensure consistency
    user_choice = user_input.lower()

#check if user choice is valid
    if user_choice in ["rock", "paper", "scissors"]:
        break
    else:
        print("Invalid choice. Please choose 'rock', 'paper', or 'scissors'.")

# Map the numeric choices to rock, paper or scissors
if computer_choice == 1: 
    computer_choice_text = "rock"
elif computer_choice == 2:
    computer_choice_text = "paper"
elif computer_choice == 3:
    computer_choice_text = "scissors"

# Display the computers choice
print(f"Computer chose {computer_choice_text}.")

if user_choice == computer_choice_text:
    print("It's a tie!")
elif (user_choice == "rock" and computer_choice_text == "scissors") or \
     (user_choice == "scissors" and computer_choice_text == "paper") or \
     (user_choice == "paper" and computer_choice_text == "rock"):
      print("You win!")
else:
    print("Computer wins!")