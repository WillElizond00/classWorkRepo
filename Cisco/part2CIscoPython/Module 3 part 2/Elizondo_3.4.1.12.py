# William Elizondo  
# 3.41.12 The Timer Class
#
# Define a function to ensure a value is represented as a two-digit string
def two_digits(val):
    s = str(val)
    # Add a leading zero if the string length is 1 (i.e., the value is less than 10)
    if len(s) == 1:
        s = '0' + s
    return s


# Define a class named Timer
class Timer:
    # Constructor with optional parameters to set hours, minutes, and seconds
    def __init__(self, hours=0, minutes=0, seconds=0):
        # Private attributes to hold hours, minutes, and seconds
        self.__hours = hours
        self.__minutes = minutes
        self.__seconds = seconds

    # String representation of the Timer object in hh:mm:ss format
    def __str__(self):
        # Format and return the time string using the two_digits function
        return two_digits(self.__hours) + ":" + \
               two_digits(self.__minutes) + ":" + \
               two_digits(self.__seconds)

    # Method to increment the time by one second
    def next_second(self):
        self.__seconds += 1  # Increment seconds
        # Check and adjust the time if seconds exceed 59
        if self.__seconds > 59:
            self.__seconds = 0  # Reset seconds to 0
            self.__minutes += 1  # Increment minutes
            # Check and adjust minutes if they exceed 59
            if self.__minutes > 59:
                self.__minutes = 0  # Reset minutes to 0
                self.__hours += 1  # Increment hours
                # Reset hours to 0 if they exceed 23
                if self.__hours > 23:
                    self.__hours = 0

    # Method to decrement the time by one second
    def prev_second(self):
        self.__seconds -= 1  # Decrement seconds
        # Check and adjust the time if seconds go below 0
        if self.__seconds < 0:
            self.__seconds = 59  # Set seconds to 59
            self.__minutes -= 1  # Decrement minutes
            # Check and adjust minutes if they go below 0
            if self.__minutes < 0:
                self.__minutes = 59  # Set minutes to 59
                self.__hours -= 1  # Decrement hours
                # Set hours to 23 if they go below 0
                if self.__hours < 0:
                    self.__hours = 23


# Create a Timer object set to 23:59:59
timer = Timer(23, 59, 59)
print(timer)  # Print the current state of the timer
timer.next_second()  # Increment the time by one second
print(timer)  # Print the updated time
timer.prev_second()  # Decrement the time by one second
print(timer)  # Print the reverted time
