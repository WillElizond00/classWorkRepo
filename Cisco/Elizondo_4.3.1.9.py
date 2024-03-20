# Define the function is_prime to check if a number is prime.
def is_prime(num):
    # Prime numbers are greater than 1. If num is less than 2, it's not prime.
    if num < 2:
        return False
    # Loop through numbers starting from 2 up to the square root of num.
    # The square root is used as the stopping point because if num has any divisors
    # other than 1 and itself, at least one of those divisors must be less than
    # or equal to the square root of num.
    for i in range(2, int(1 + num ** 0.5)):
        # If num is evenly divisible by any number within this range, it is not prime.
        # This is because prime numbers have no divisors other than 1 and themselves.
        if num % i == 0:
            return False  # Found a divisor, so num is not prime.
    # If the loop completes without finding any divisors, num is prime.
    return True

# Loop through numbers from 1 to 19 to find and print prime numbers.
for i in range(1, 20):
    # Use the is_prime function to check if the number is prime.
    if is_prime(i + 1):
        # If the number is prime, print it followed by a space.
        print(i + 1, end=" ")
# Print a newline character after printing all prime numbers in the range.
print()
