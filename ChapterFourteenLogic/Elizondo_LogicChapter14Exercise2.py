# William Elizondo
# Logic Chapter 14 Exercise 2 
# 
# 

class Car:
    def __init__(self,yearModel, make):
        self.yearmodel = yearModel # Integer holding the cars model
        self.make = make # String holding the make of the car
        self.speed = 0 # Integer holding the car's current speed

# Accessor methods to get the values of the fields
    def get_yearModel(self):
        return self.yearModel

    def get_make(self):
        return self.make

    def get_speed(self):
        return self.speed
    
    # Method to increase the speed
    def accerlate(self):
        self.speed += 5
    #Method to decrease the speed
    def brake(self):
        self.speed -= 5

# Create a Car object
my_car = Car(2003, "Toyota")

# Accelerate the car five times and print speed each time
print("Accelerating:")
for i in range(5):
    my_car.accerlate()
    print(f"Current speed: {my_car.get_speed()} mph")

# Brake the car five times and print the speed each time
print("Braking:")
for i in range(5):
    my_car.brake()
    print(f"Current speed: {my_car.get_speed()} mph")