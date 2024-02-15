'''

A bug collector collects bugs every day for seven days. Design a program that keeps a running total
of the number of bugs collected during the seven days. The loop should ask for the number of bugs
collected for each day, and when the loop is finished, the program should display the total number of
bugs collected

'''
TOTAL_DAYS = 7
totalBugs = 0
bugsForTheDay = 0

for day in range(1,TOTAL_DAYS + 1):
    bugsForTheDay = int(input(f"How many bugs were collected on day {day}, running total {totalBugs} "))
    totalBugs += bugsForTheDay


print(totalBugs)
