# password.py
# William ELizondo
# Feburary 7th 2024
# Test password validation
#
# 1 Give the user 3 tries
MAX_TRIES = 3
tries = 0
password = "Academy"

while tries < MAX_TRIES: 
    # 1- Prompt the user for a password
    myPassword = input("Please enter your password : ")
    # 2- Validate password
    # 3- Acknowledge to the user
    if myPassword == password:
        print("Correct Password")
        break
    else:
        print("Incorrect password")
        tries = tries + 1
    if tries >= MAX_TRIES:
        print("You are locked out. You've exceeded the maximum number of tries.")

