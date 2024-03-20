# Convert  fuel efficiency from liters per 100 kilometers to miles per gallon

# 1 American mile = 1609.344 metres
# 1 American gallon = 3.785411784 litres

def liters_100km_to_miles_gallon(litres):
    # Convert liters to American gallons
    gallons = litres / 3.785411784
    # Calculate how many miles are in 100 kilometers.
    miles = 100 * 1000 / 1609.344
    # Return the number of miles that can driven per gallon of fuel.
    return miles / gallons

# Convert fuel efficiency from miles per gallon to liters per 100 kilometers.
def miles_gallon_to_liters_100km(miles):
    # Convert miles into  100 kilometers.
    km100 = miles * 1609.344 / 1000 / 100
    # The number of liters in one American gallon.
    litres = 3.785411784
    # Return the number of liters needed to drive 100 kilometers.
    return litres / km100

# Test the function by converting 3,9,7.5, and 10 liters per 100 kilometers to miles per gallon
print(liters_100km_to_miles_gallon(3.9))
print(liters_100km_to_miles_gallon(7.5))
print(liters_100km_to_miles_gallon(10.))

# Test the function by converting 60.3, 31.4, and 23.5 miles per gallon to liters per 100 kilometers.
print(miles_gallon_to_liters_100km(60.3))
print(miles_gallon_to_liters_100km(31.4))
print(miles_gallon_to_liters_100km(23.5))
