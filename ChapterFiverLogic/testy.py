years = 2 # years
MTHS = 12 # months

totalMthsAllYears = 0 # accumlation for all the years 
totalMthsPerYear = 0 # acculation for each year

inputMths = 0 # input variable

for y in range(years) : # outer (3 times)

    #totalMthsPerYear = 0 # accumulation for each year
    for m in range(MTHS): # Inner (12 Times)
        inputMths = int(input("Please enter the Month: "))
        totalMthsPerYear = totalMthsPerYear + inputMths
        print("Total Months: ", totalMthsPerYear)

    totalMthsAllYears = totalMthsAllYears + totalMthsPerYear
    print("Total mths per year", totalMthsAllYears)

print("Total of all months for all years ", totalMthsAllYears)
