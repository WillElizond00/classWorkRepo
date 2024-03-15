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


            #Calculate the row and column from user_input
            row = (user_input - 1) // 3
            col = (user_input - 1) % 3

            # Check if the chosen position is available (not already taken by 'O' or 'X')
            if board[row][col] not in ["O", "X"]:
                # If so, update the board with the user's move ('O")
                board[row][col] = 'O'

                #confirm the chosen position to the user by printing it out
                print("You chose position:", user_input)

                # Exit the loop because a valid input was received.
                break
            else: 
                # The chosen position is already taken
                print("This position is already taken. Please try another one.")
        else:
            print("Invalid input. Please enter a number between 1 and 9.")


def make_list_of_free_fields(board):
    # The function browses the board and builds a list of all the free squares; 
    # the list consists of tuples, while each tuple is a pair of row and column numbers.



    # Initialize an empty list to hold the positions of free squares
    free_squares = []

    #Browse the board 
    for row in range(len(board)):
        for col in range(len(board[row])):
            # Check if the current cell is free
            if board[row][col] not in ['O', 'X']:
                # The cell is free, add it to the list as a tuple (row, col)
                free_squares.append((row, col))

# At this point, free_squares contains all the free positions on the board
    return free_squares


def victory_for(board, sign):
    # The function analyzes the board's status in order to check if 
    # the player using 'O's or 'X's has won the game


#Check for horizontal and vertical wins
    for i in range(3):
        if all(board[i][j] == sign for j in range(3)): # Check each row
            return True
        if all(board[j][i] == sign for j in range(3)): # Check each column
            return True
        
# Check left-to-right diagonal
    if all(board[i][i] == sign for i in range(3)):
        return True
        
# Check right-ro-left diagonal 
    if all(board[i][2 - i] == sign for i in range(3)):
        return True


    return False # No win condition






def draw_move(board):
    # The function draws the computer's move and updates the board.
    for row in range(3):
        for col in range(3):
            # Check if the spot is free
            if board[row][col] not in ['O', 'X']:
                # Place computer's move ('X') in the first free spot found
                board[row][col] = 'X'
                # Return immediately after placing the move, no need to continue searching
                return




display_board(board)
enter_move(board)
display_board(board)