# William Elizondo
# 2.5.1.10 LAB: Find a word!
#
# Ask the user to enter the word they want to find to convert it to uppercase.
word = input("Enter the word you wish to find: ").upper()
# Ask the user to enter the string they want to search through and convert it to uppercase.
strn = input("Enter the string you wish to search through: ").upper()
#Initialize a variable to track if a word is in the string.
found = True
#Initialize a variable to track the starting position for the search in the string.
start = 0


# Loop through each character in the word.
for ch in word:
    # Find the position of the current character in the string, starting from 'start' position.
	pos = strn.find(ch, start) 
	
	# If the character is not found, set 'found' to False and exit the loop.
	if pos < 0:
		found = False
		break
		
	# Update 'start' to the position after the current character's position, for the next iteration 
	start = pos + 1
	
	#After the loop, check if all characters were found
if found:
	print("Yes")
else:
	print("No")
