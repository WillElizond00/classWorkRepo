# William Elizondo  
# 3.4.1.13 LAB : Days of the week
#
# Define a custom exception class for invalid weekdays
class WeekDayError(Exception):
    pass

# Define a class to handle weekdays
class Weeker:
    # Class variable containing names of the weekdays
    __names = ['Mon', 'Tue', 'Wed', 'Thu', 'Fri', 'Sat', 'Sun']

    # Constructor that initializes the object with a day
    def __init__(self, day):
        try:
            # Attempt to set the current day by finding the index of the given day in the names list
            self.__current = Weeker.__names.index(day)
        except ValueError:
            # If the day is not found in the list, raise a WeekDayError
            raise WeekDayError

    # String representation of the object, returning the current day
    def __str__(self):
        return Weeker.__names[self.__current]

    # Method to add a certain number of days to the current day
    def add_days(self, n):
        # Update the current day index by adding n and modulating by 7 to wrap around the week
        self.__current = (self.__current + n) % 7

    # Method to subtract a certain number of days from the current day
    def subtract_days(self, n):
        # Update the current day index by subtracting n and modulating by 7 to wrap around the week
        self.__current = (self.__current - n) % 7

# Main script
try:
    # Create a Weeker object with the initial day 'Mon'
    weekday = Weeker('Mon')
    print(weekday)  # Output should be 'Mon'
    weekday.add_days(15)  # Add 15 days to 'Mon', which wraps around more than twice
    print(weekday)  # Output should be the day 15 days after 'Mon'
    weekday.subtract_days(23)  # Subtract 23 days from the current day
    print(weekday)  # Output should be the day 23 days before the current day

    # Attempt to create a Weeker object with an invalid day 'Monday'
    weekday = Weeker('Monday')
except WeekDayError:
    # Catch the WeekDayError and print a message
    print("Sorry, I can't serve your request.")

