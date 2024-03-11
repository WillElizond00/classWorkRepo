# Define a function to check if a given year is a leap year.
def is_year_leap(year):
    # If year is not divisible by 4, it's not a leap year.
    if year % 4 != 0:
        return False
    # If year is divisible by 4 but not by 100, it is a leap year.
    elif year % 100 != 0:
        return True
    # If year is divisible by 100 but not by 400, it's not a leap year.
    elif year % 400 != 0:
        return False
    # If year is divisible by 400, it is a leap year.
    else:
        return True

# Define a function to get the number of days in a specific month of a given year.
def days_in_month(year, month):
    # Check for invalid input (year before 1582 or invalid month).
    if year < 1582 or month < 1 or month > 12:
        return None
    # List storing the number of days in each month for a common year.
    days = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    # Get the number of days in the given month.
    res = days[month - 1]
    # If it's February and the year is a leap year, adjust days to 29.
    if month == 2 and is_year_leap(year):
        res = 29
    return res

# Define a function to calculate the day of the year given a specific date.
def day_of_year(year, month, day):
    days = 0  # Initialize total days counter.
    # Sum days for all months before the given month.
    for m in range(1, month):
        md = days_in_month(year, m)  # Get days in month m.
        if md == None:  # If invalid month/year, return None.
            return None
        days += md  # Add days in month m to total.
    # Get days in the given month to check if the day is valid.
    md = days_in_month(year, month)
    # If day is within the valid range for the month, calculate day of the year.
    if day >= 1 and day <= md:
        return days + day  # Return total days up to the given day.
    else:  # If day is invalid, return None.
        return None

# Example usage: Print the day of the year for December 31, 2000.
print(day_of_year(2000, 12, 31))

