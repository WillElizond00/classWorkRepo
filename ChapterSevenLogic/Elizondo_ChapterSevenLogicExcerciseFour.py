#Chapter Seven Logic Exercise Four
# William Elizondo 
# 02/28/2024
#
# Speeding Violation Calculator
# Design a program that calculates and displays the number of miles per hour over the speed limit that
# a speeding driver was doing. The program should ask for the speed limit and the driver’s speed.
# Validate the input as follows:
# The speed limit should be at least 20, but not greater than 70.
# The driver’s speed should be at least the value entered for the speed limit (otherwise the driver
# was not speeding).
# Once correct data has been entered, the program should calculate and display the number of miles
# per hour over the speed limit that the driver was doing

# Ask for the speed limit 

speedLimit = float(input("Please enter the speed limit "))


#Speed limit must be at least 20 but not greater than 70
while speedLimit < 20 or speedLimit > 70:
    print("Speed limit must be between 20 and 70, retry")
    speedLimit = float(input("Please enter the speed limit "))


# Ask for the drivers speed 

driversSpeed = float(input("Please enter drivers speed "))


#Drivers speed must be at least the speedLimit to be considered speeding
while driversSpeed <= speedLimit:
    print("Drivers speed must be higher than the speed limit to count as speeding. Please re-enter the driver's speed.")
    driversSpeed = float(input("Please enter the drivers speed: "))

# Calculate the speed difference
speedOverLimit = driversSpeed - speedLimit

print(f"Driver was speeding at {speedOverLimit} mph over the speed limit")