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



outFile = open('friends.txt', 'a')

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
            elif menuChoice == "5":
                next = False
                break



def addARecord():
    myList = []
    myListy = []
    name = outFile.write(input("Enter a name : "))
    phone = outFile.write(input("Enter phone number : ") + "\n")
    myList.append(name)
    myListy.append(phone)
    print(myList)





def nameSearch():
    outFile = open('friends.txt', 'r')
    print(outFile.read())
    #name1 = input("Enter name you're searching for : ")
    
    line = "One"
    while line > " ":
        line = outFile.readline()

        line1 = line.split(" ")
        print(line1)


main()

outFile.close()