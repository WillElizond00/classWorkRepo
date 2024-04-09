# William Elizondo
# Chapter 11 Exercise 6
#
# Design a program that you can use to keep all of your friend's names and phone numbers in a file.
# The program should be menu-driven, and offer the following operations:
# 1. Add a new record
# 2. Search a for a name
# 3. Modify a phone number
# 4. Delete a record
# 5. Exit a program


# append mode
outFile = open('friends.txt', 'a')
# main menu
def main():
    next = True
    while next:
        print("1. Add a new record ")
        print("2. Search for name")
        print("3. Modify a phone number")
        print("4. Delete a record")
        print("5. Exit a program")

        menuChoice = input("Enter a choice : ")

        while menuChoice >= "1" or menuChoice <= "5":
            if menuChoice == "1":
                addARecord()
                break
            elif menuChoice == "2":
                nameSearch()
                break
            elif menuChoice == "3":
                modifyPhoneNumber()
                break
            elif menuChoice == "4":
                deleteRecord()
                break
            elif menuChoice == "5":
                next = False
                break
            else:
                print("Try again")
                break
# Add a record
def addARecord():
    outFile = open("friends.txt", "a")
    name = input("Enter a name: ")
    phone = input("Enter a phone number: ")
    outFile.write(name + " " + phone + "\n")
    outFile.close()

def nameSearch():
    search_name = input("Enter your name to search : ")
    outFile = open('friends.txt', 'r')
    for line in outFile:
        if search_name.lower() in line.lower():
            print(line.strip())
    print(outFile.read())
    
def modifyPhoneNumber():
    personSearch = input("Enter the name of the person who's number you want to change : ")
    

def deleteRecord():
    personLookUp = input("Enter the name of the record you want to delete : ")

    outFile = open('friends.txt', 'r')
    lines = outFile.readlines()
    outFile.close()

    updatedLines = [line for line in lines if personLookUp.lower() not in line.lower()]
    outFile = open('friends.txt', 'w')
    outFile.writelines(updatedLines)
    outFile.close()

    print(f"Record for {personLookUp} has been deleted.")

main()

outFile.close()