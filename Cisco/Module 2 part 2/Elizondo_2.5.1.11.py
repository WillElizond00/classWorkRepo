# A function that checks whether a list passed as an argument contains
# nine digits from '1' to '9'.
def checkset(digs):
    # Returns True if the sorted list of digits matches a list of characters '1' to '9'
    return sorted(list(digs)) == [chr(x + ord('0')) for x in range(1, 10)]

# Initialize an empty list to store rows of the sudoku puzzle.
rows = []
# Loop to get 9 rows of input for the sudoku puzzle.
for r in range(9):
    ok = False  # Flag to check if the input row is valid.
    while not ok:
        row = input("Enter row #" + str(r + 1) + ": ")  # Prompt user to enter a row.
        # Check if the row contains exactly 9 digits.
        ok = len(row) == 9 and row.isdigit()
        if not ok:
            print("Incorrect row data - 9 digits required")  # Error message for invalid input.
    rows.append(row)  # Add the valid row to the list of rows.

ok = True  # Initialize a flag to true to start checking the sudoku validity.

# Check if all rows contain unique digits from '1' to '9'.
for r in range(9):
    if not checkset(rows[r]):
        ok = False
        break

# Check if all columns contain unique digits from '1' to '9'.
if ok:
    for c in range(9):
        col = []  # List to store the digits of the column.
        for r in range(9):
            col.append(rows[r][c])  # Append the digit at the current column of each row.
        if not checkset(col):
            ok = False
            break

# Check if all 3x3 sub-squares contain unique digits from '1' to '9'.
if ok:
    for r in range(0, 9, 3):  # Iterate over the rows, starting from 0, in steps of 3.
        for c in range(0, 9, 3):  # Iterate over the columns, starting from 0, in steps of 3.
            sqr = ''  # String to store the digits of the sub-square.
            for i in range(3):  # Loop to concatenate the digits from three rows.
                sqr += rows[r+i][c:c+3]
            if not checkset(list(sqr)):
                ok = False
                break

# Print the result based on the value of 'ok'.
if ok:
    print("Yes")  # All checks passed, the input represents a valid Sudoku configuration.
else:
    print("No")  # One or more checks failed, the input is not a valid Sudoku configuration.
