# William Elizondo
# Logic Chapter 14 Exercise 4 
# 
# 


class Employee:
    def __init__(self, name, number):
        self.name = name
        self.number = number

#Accessor methods
    def get_name(self):
        return self.name
    
    def get_number(self):
        return self.number
    
#Mutator methods

    def set_name(self, name):
        self.name = name
    
    def set_number(self, number):
        self.number = number


class ProductionWorker(Employee):
    def __init__(self, name, number, shift_number, hourly_pay):
        super().__init__(name, number) #Inherit
        self.shift_number = shift_number
        self.hourly_pay = hourly_pay


# Accessor methods
    def get_shift_number(self):
        return self.shift_number
    
    def get_hourly_pay(self):
        return self.hourly_pay

# Mutator methods

    def set_shift_number(self, shift_number):
        if shift_number in (1, 2):
            self.shift_number = shift_number
        else:
            raise ValueError("Invalid shift number. Choose 1 for day shift or 2 for night shift.")
        
    def set_hourly_pay(self, hourly_pay):
        if hourly_pay > 0:
            self.hourly_pay = hourly_pay
        else:
            raise ValueError("Hourly pay must be positive.")
        
def main():
    # Get user input
    name = input("Enter the employee name: ")
    number = input("Enter employee number: ")
    shift_number = int(input("Enter shift number (1 for day, 2 for night): "))
    hourly_pay = float(input("Enter hourly pay rate: "))

# Create ProductionWorker Object
    worker = ProductionWorker(name, number, shift_number, hourly_pay)

    # Display worker information
    print("\nEmployee Details:")
    print("Name:", worker.get_name())
    print("Number:", worker.get_number())
    print("Shift Number", "Day" if worker.get_shift_number() == 1 else "Night")
    print("Hourly Pay Rate: ${:.2f}".format(worker.get_hourly_pay()))

# Run the program
main()