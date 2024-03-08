#input statement
statement = input("Write the best plant ever in here : ")
#Correct statement
if statement == "Spathiphyllum":
    print("Yes - Spathiphyllum is the best plant ever!")
#lower case statement
elif statement == "spathiphyllum":
    print("No I want big Spathiphyllum!")
#anything else
else: 
    print(f"Spathiphyllum! Not {statement}!")