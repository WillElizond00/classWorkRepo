
#a while loop test  - Pre-Test
maxCount = 10
currCount =  1

while currCount <= maxCount:
    print(currCount,"Hello World!")
    currCount = currCount + 1 #incrementor

# a for loop example
myCount = int(input("Please enter the number of counts : "))
for i in range(myCount):
        print(i,"Hello World!")

#needs the endpoint only for the loop to work 

# Running total
total = 0 
value = 0 

while not value == 9999:
    value = int(input("Please enter a number to add or 9999 to stop: "))
    if value == 9999:
         break
    total = total + value
    print("Total : ",total)

print("Total : ", total)