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

# Define a function to determine the number of days in a given month of a specific year.
def days_in_month(year,month):
    # Validate the year and month. The Gregorian calendar started in 1582.
    if year < 1582 or month < 1 or month > 12:
        return None
    # List of days in each month for a common year. February has 28 days by default.
    days = [31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31]
    # Get the number of days in the specified month from the list.
    res = days[month - 1]
    # If it's February in a leap year, set the number of days to 29.
    if month == 2 and is_year_leap(year):
        res = 29
    # Return the number of days in the specified month.
    return res

# Test data for years and corresponding months.
test_years = [1900, 2000, 2016, 1987]
test_months = [2, 2, 1, 11]
# Expected results for the test cases.
test_results = [28, 29, 31, 30]
# Loop through the test data to check if `days_in_month` function works correctly.
for i in range(len(test_years)):
    yr = test_years[i]  # Current year being tested.
    mo = test_months[i]  # Current month being tested.
    print(yr, mo, "-> ", end="")
    # Get the result from the `days_in_month` function.
    result = days_in_month(yr, mo)
    # Check if the result matches the expected outcome.
    if result == test_results[i]:
        print("OK")  # The test passed.
    else:
        print("Failed")  # The test failed.
