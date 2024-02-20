'''

Tuition Increase
At one college, the tuition for a full-time student is $6,000 per semester. It has been announced that
the tuition will increase by 2 percent each year for the next five years. Design a program with a loop
that displays the projected semester tuition amount for the next five years

'''

currentTuition = 6000
annualIncrease = .02
yearsToProject = 5

for year in range(1, yearsToProject + 1):
    currentTuition += currentTuition * annualIncrease
    print(f"Year {year}: ${currentTuition: }")


    