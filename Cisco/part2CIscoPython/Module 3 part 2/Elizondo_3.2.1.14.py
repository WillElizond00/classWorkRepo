# William Elizondo
# 3.2.1.14 Counting Stack
#
class Stack:
    def __init__(self):
        # Initialize a private stack list when a Stack instance is created
        self.__stk = []

    def push(self, val):
        # Add an element to the top of the stack
        self.__stk.append(val)

    def pop(self):
        # Remove and return the top element to the stack
        val = self.__stk[-1]
        del self.__stk[-1]
        return val


class CountingStack(Stack):
    def __init__(self):
        # Call the constructor of the Stack class to initialize the stack
        Stack.__init__(self)
        # Initialize a private counter to track the number of pop operations
        self.__counter = 0

    def get_counter(self):
        # Return the current value of the counter
        return self.__counter

    def pop(self):
        # Increment the counter on each pop operation
        self.__counter += 1
        # Call the pop method of the base Stack class and return it's value
        return Stack.pop(self)


stk = CountingStack() # Create an instance of CountingStack
for i in range(100):
    # Push and immediately pop an element 100 times
    stk.push(i)
    stk.pop()
print(stk.get_counter()) # Print the number of pop operations performed.
