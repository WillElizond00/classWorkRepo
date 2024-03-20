# William Elizondo
# 2.5.1.8 Anagrams
#
# ASk the user for two separate texts
str_1 = input("Enter the first string: ")
str_2 = input("Enter the second string: ")

strx_1 = ''.join(sorted(list(str_1.upper().replace(' ',''))))
strx_2 = ''.join(sorted(list(str_2.upper().replace(' ',''))))
#Checks whether the entered texts are anagrams
if len(strx_1) > 0 and strx_1 == strx_2:
	print("Anagrams")
else:
	print("Not anagrams")
