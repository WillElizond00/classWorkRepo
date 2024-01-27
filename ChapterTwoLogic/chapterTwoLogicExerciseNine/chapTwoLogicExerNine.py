# variables
# Computer asks for weight
print("Enter starting weight")

# Input weight
startingWeight = float(input())

# Weight loss every month
weightLossPerMonth = 4

# Month 1 weight
monthOneWeight = startingWeight - weightLossPerMonth
print("Month One")
print(monthOneWeight)

# Month 2 weight
monthTwoWeight = monthOneWeight - weightLossPerMonth
print("Month Two")
print(monthTwoWeight)

# Month 3 weight
monthThreeWeight = monthTwoWeight - weightLossPerMonth
print("Month three")
print(monthThreeWeight)

# Month 4 weight
monthFourWeight = monthThreeWeight - weightLossPerMonth
print("Month Four")
print(monthFourWeight)

# Month 5 weight
monthFiveWeight = monthFourWeight - weightLossPerMonth
print("Month Five")
print(monthFiveWeight)

# Month 6 weight
monthSixWeight = monthFiveWeight - weightLossPerMonth
print("Month six")
print(monthSixWeight)
print("Congrats on your weight loss!")
