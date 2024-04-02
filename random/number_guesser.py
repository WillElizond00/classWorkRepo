import random 

top_of_range = input("Type a number: ")




if top_of_range.isdigit():
    top_of_range = int(top_of_range)

    if top_of_range <= 0:
        print('Please a type a number larger than zero next time.')
        quit()
else:
    print('Please type in a number next time.')
    quit()
random_number = random.randint(11)



