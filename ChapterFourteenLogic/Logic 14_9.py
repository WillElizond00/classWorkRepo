 # Program Logic 14_9.py
# William Elizondo
# 04/11/2024
# Python 3/12 Windows 
# Create a class for a cell phone with the following attributes
# Attributes : manufacturer, model, price
# 1- className
class CellPhone:

    # 2- Declaring Instance Variables (Not needed for Python)
    # 3- Constructor - Special Method to Initialize our variables
    def __init__(self,manufact, myModel, myPrice):
        self.__manufacturer = manufact
        self.__model = myModel
        self.__price = myPrice

        
    # 4- Instance Methods
    # Mutators - Setters
    def set_manufacturer(self, manufact):
        self.__manufacturer = manufact

    def set_model(self, myModel):
        self.__model = myModel

    def set_price(self, myPrice):
        self.__price = myPrice
            
    # Accessors - Getters    
    def get_manufacturer(self):
        return self.__manufacturer
    
    def get_model(self):
        return self.__model
    
    def get_price(self):
        return self.__price
    
    # 5- Class Variables
    # 6- Class Methods 

# End of class 


def main():

# Create a cellPhone object & initialize 
# its fields with values passed to the constructor (__init__)
    phone1 = CellPhone("Motorola","M1000", 199.99)
    phone2 = CellPhone("Apple","iPhone 14", 1500.00)

    print("Manufacturer : ", phone1.get_manufacturer())
    print("Model : ", phone1.get_model())
    print("Price : ", phone1.get_price(), "\n")

    phone2.set_manufacturer("Samsung")
    print("Manufacturer : ", phone2.get_manufacturer())
    print("Model : ", phone2.get_model())
    print("Price : ", phone2.get_price())
main()