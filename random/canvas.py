#function = A block of reusable code
#           place () after the function name to invoke it

# return  = statement used to end a function
#           and send a result back to the caller


# def happy_birthday(name, age):
#     print(f"Happy birthday to {name}!")
#     print(f"You are {age} years old!")
#     print("Happy birthday to you!")
#     print()

# happy_birthday("Bro", 20)
# happy_birthday("Steve", 30)
# happy_birthday("Joe", 40)


# def display_invoice(username, amount, due_date):
#     print(f"Hello {username}")
#     print(f"Your bill of amount ${amount:.2f} is due: {due_date}")

# display_invoice("JoeSchmo", 100.01, "01/01")


def create_name(first, last):
    first = first.capitalize()
    last = last.capitalize()
    return first + " " + last

full_name = create_name("spongebob", "squarepants")

print(full_name)