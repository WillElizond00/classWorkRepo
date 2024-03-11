def is_year_leap(year):
    # Check if the year is not divisible by 4; such years not leap years.
	if year % 4 != 0:
		return False
	# If the year is disvisible by 4 but not by 100, it is a leap year.
	elif year % 100 != 0:
		return True
	# For years divisible by 100 but not by 400, they are not leap years
	elif year % 400 != 0:
		return False
	# The year is divisible by 400; it is a leap year.
	else:
		return True
# Test data: list of years to check
test_data = [1900, 2000, 2016, 1987]
# Expected results corresponding to the test_data
test_results = [False, True, True, False]

# Loop through the test_data to check each year
for i in range(len(test_data)):
	yr = test_data[i] #Current year being checked
	print(yr,"-> ",end="") # Print the year being tested
	result = is_year_leap(yr) # Determine if the year is a leap year
	
	# Check if the computed result matches the expected result
	if result == test_results[i]:
		print("OK") # The resut  matches the expectation
	else:
		print("Failed") # The result does not match the expectation
