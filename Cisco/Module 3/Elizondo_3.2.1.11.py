
# create an empty string and assign it to word_without_vowels
word_without_vowels = ""
# ask user to enter a word
user_word = input("Enter your word: ")
# user .upper to convert word entered by the user to upper case.
user_word = user_word.upper()

# use a for loop for each letter in the word inputted by the user 
for letter in user_word:
    #check for vowels
    if letter == "A":
        continue
    elif letter == "E":
        continue
    elif letter == "I":
        continue
    elif letter == "O":
        continue
    elif letter == "U":
        continue
    else:
        word_without_vowels += letter
		
print(word_without_vowels)
