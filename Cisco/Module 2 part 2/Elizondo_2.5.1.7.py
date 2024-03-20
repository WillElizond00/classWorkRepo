# William Elizondo
# 2.5.1.7 LAB: Palidromes
#

# Ask user for some text
text = input("Enter text: ")

# remove all spaces...
text = text.replace(' ','')

# ... and check if the word is equal to reversed itself
if len(text) > 1 and text.upper() == text[::-1].upper():
	print("It's a palindrome")
else:
	print("It's not a palindrome")
