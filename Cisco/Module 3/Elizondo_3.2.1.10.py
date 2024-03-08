# Ask the user to enter a word
user_word = input("Enter your word: ")
# Convert the word entered by the user to all capitals
user_word = user_word.upper()

#loop through each letter in the user's word
for letter in user_word:
# Check if the letter is a vowel
    if letter in ['A', 'E', 'I', 'O', 'U']:
        # If it is not a vowel, skip to the next iteration of the loop
        continue
# if it's not a vowel, print the letter
    else:
        print(letter)
