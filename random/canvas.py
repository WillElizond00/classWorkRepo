# Object Orientated Programming

class Dog:
    def __init__(self, name, age):
        self.name = name
        self.age = age
    
    def bark(self):
        return f"{self.name} says woof!"
    
    def bite(self):
        return f"{self.name} bit the person!"
    
my_dog = Dog("Buddy", 3)
print(my_dog.bark())
print(my_dog.bite())