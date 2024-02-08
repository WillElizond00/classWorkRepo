print("How many books did you purchase this month?")

num_books = int(input("Enter the number of books "))

if num_books == 0:
    points = 0
elif num_books == 1:
    points = 5
elif num_books == 2:
    points = 15
elif num_books == 3:
    points = 30
elif num_books >= 4:
    points = 60
print("Points awarded:", points)