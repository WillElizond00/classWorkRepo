# William Elizondo 
# Chapter 12 Logic Exercise 6
#
# Alphabet Telephone Number Translator
# Many COmpanies use telephone numbers like 555-GET-FOOD so the number is easier for their customers to remember
# On a standard telephone, the alphabetic letters are mapped to numbers in the following fashion:
# A, B, and C = 2
#
# D, E, and F = 3
# 
# G, H, and I = 4
#
# J, K, and L = 5
#
# M, N, and O = 6
#
# P, Q, R, and S = 7
#
# T, U, and V = 8
#
# W, X, Y, and Z =9
#
# Design a program that asks the user to enter a 10-character telephone number in the formate of XXX-XXX-XXXX.
# The program should display the telephone number with any alphabetic characters that appeared in the original translated to their numeric equivalent.
# For example, if the user enters 555-GET-FOOD the program should display 555-438-3663. 

phone_number = input("Enter a 10 character telephone number (XXX-XXX-XXXX)")
translated_number = ""
for char in phone_number: # Iterates through each character in the input phone number 
    if char.isalpha(): # Checks if the character is alphbetic (a letter).
        char = char.upper() # Converts the character the uppercase for consistency.
        # Checks which group of letters the character belongs to and translates it to its corresponding number.
        if 'A' <= char <= 'C':
            translated_number += '2'
        elif 'D' <= char <= 'F':
            translated_number += '3'
        elif 'G' <= char <= 'I':
            translated_number += '4'
        elif 'J'<= char <= 'L':
            translated_number += '5'
        elif 'M' <= char <= 'O':
            translated_number += '6'
        elif 'P' <= char <= 'S':
            translated_number += '7'
        elif 'T' <= char <= 'V':
            translated_number += '8'
        elif 'W' <= char <= 'Z':
            translated_number += '9'
    else: # If the character is not alphabetic (e.g., a number or a hyphen), it is added to the translated number as is. 
        translated_number += char

print("Translated telephone number: ", translated_number)