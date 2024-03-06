# Assuming numberArray1 has been previously defined and filled with 100 elements
numberArray1 = [x for x in range(100)]  # Example: Filling numberArray1 with values 0 to 99

# Initializing numberArray2 with 100 placeholder values (could be zeros or any value)
numberArray2 = [0 for _ in range(100)]  # Placeholder values, will be overwritten

# Copying values from numberArray1 to numberArray2
for i in range(100):
    numberArray2[i] = numberArray1[i]

# Optional: Print numberArray2 to verify the copy operation
print(numberArray2)
