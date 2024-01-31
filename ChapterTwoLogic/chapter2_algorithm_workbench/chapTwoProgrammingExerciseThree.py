
#define acre
acre = 43560

# Get total square feet from user
print("What's the total number of square feet in the tract of land you want and we'll calculate the number of acres ")
land = int(input())

# Calculate the number of acres
acres = land / acre

print(acres)