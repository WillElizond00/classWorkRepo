
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
import random
# Initialize variables
compChoice = 0
playerChoice = 0 
choices = [1, 2, 3]
choiceValues = ["Rock","Paper","Scissors"]
print(choices[0])
print(choiceValues[0])

# get random number for computer choice
compChoice = random.randint(1, 3)
print("computers choice", compChoice) # Debug

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

