# William Elizondo
# 2.5.1.11 LAB : Sudoku
#
# A function that checks whether a list passed as an argument contains
# nine digits from '1' to '9'.
def checkset(digs):
    # Converts the list of digits to a sorted list and compares it with a list of characters
    # from '1' to '9' to see if they are the same, thus verifying the set of digits.
    return sorted(list(digs)) == [chr(x + ord('0')) for x in range(1, 10)]

# Initialize an empty list to hold the rows of the Sudoku puzzle.
rows = []
for r in range(9):
    ok = False  # Flag to check if the row input is valid
    while not ok:
        # Prompt the user to enter a row of digits and validate the input
        row = input("Enter row #" + str(r + 1) + ": ")
        # Check if the row contains exactly 9 digits
        ok = len(row) == 9 and row.isdigit()
        if not ok:
            print("Incorrect row data - 9 digits required")
    # Add the validated row to the list of rows
    rows.append(row)

ok = True  # Flag to indicate if the Sudoku grid is valid

# Check if all rows are good.
for r in range(9):
    # Use the checkset function to validate each row.
    if not checkset(rows[r]):
        ok = False
        break

# Check if all columns are good.	
if ok:
    for c in range(9):
        col = []  # Initialize a list to hold the column's digits
        for r in range(9):
            # Append each digit from the current column to the list
            col.append(rows[r][c])
        # Use the checkset function to validate each column.
        if not checkset(col):
            ok = False
            break

# Check if all sub-squares (3x3) are good.
if ok:
    # Iterate through each 3x3 square in the Sudoku grid
    for r in range(0, 9, 3):
        for c in range(0, 9, 3):
            sqr = ''  # Initialize a string to hold the square's digits
            # Concatenate all digits from the current square into the string
            for i in range(3):
                sqr += rows[r + i][c:c + 3]
            # Use the checkset function to validate each square.
            if not checkset(list(sqr)):
                ok = False
                break

# Print the final verdict based on the 'ok' flag.
if ok:
    print("Yes")  # All checks passed, Sudoku is valid
else:
    print("No")  # One or more checks failed, Sudoku is not valid
