def display_board(board):
    # The function accepts one parameter containing the board's current status
    # and prints it out to the console.
    print("+-------+-------+-------+")
    for row in board:
        print("|       |       |       |")
        print("|   " + row[0] + "   |   " + row[1] + "   |   " + row[2] + "   |") # Adjusted for consistent spacing
        print("|       |       |       |")
        print("+-------+-------+-------+")
board = [["1","2","3"],["4","5","6"],["7","8","9"]]

def enter_move(board):
    # The function accepts the board's current status, asks the user about their move, 
    # checks the input, and updates the board according to the user's decision.


    # Start an infinite loop to keep asking for the user's move until a valid input is given.
    while True:
        #Prompt the user to enter their move, indicating the valid range (1-9).
        user_input = input("Enter your move (1-9):")


        # Check if the input is a digit (to prevent errors when converting to int)
        # and if it's within the valid range of 1 to 9
        if user_input.isdigit() and 1 <= int(user_input) <= 9:
            # Convert the input from a string to an integer
            user_input = int(user_input)

            #confirm the chosen position to the user by printing it out
            print("You chose position:", user_input)

            # Exit the loop because a valid input was received.
            break
        else:
            print("Invalid input. Please enter a number between 1 and 9.")


#def make_list_of_free_fields(board):
    # The function browses the board and builds a list of all the free squares; 
    # the list consists of tuples, while each tuple is a pair of row and column numbers.


#def victory_for(board, sign):
    # The function analyzes the board's status in order to check if 
    # the player using 'O's or 'X's has won the game


#def draw_move(board):
    # The function draws the computer's move and updates the board.


display_board(board)

enter_move(board)
