# William Elizondo
# 3.2.1.16 Queue aka FIFO: part 2
#
# Custom exception class for queue-related errors, inheriting from IndexError
class QueueError(IndexError):
    pass

# Queue class definition
class Queue:
    def __init__(self):
        self.queue = []  # Initialize an empty list to represent the queue

    def put(self, elem):
        self.queue.insert(0, elem)  # Insert an element at the beginning of the list

    def get(self):
        if len(self.queue) > 0:  # Check if the queue is not empty
            elem = self.queue[-1]  # Get the last element of the list
            del self.queue[-1]  # Remove the last element from the list
            return elem  # Return the removed element
        else:
            raise QueueError  # Raise an error if trying to get from an empty queue

# SuperQueue class inheriting from Queue
class SuperQueue(Queue):
    def isempty(self):
        return len(self.queue) == 0  # Return True if the queue is empty, False otherwise

# Instantiate a SuperQueue object
que = SuperQueue()
que.put(1)  # Add 1 to the queue
que.put("dog")  # Add "dog" to the queue
que.put(False)  # Add False to the queue

# Iterate 4 times
for i in range(4):
    if not que.isempty():  # Check if the queue is not empty
        print(que.get())  # Print and remove the last element from the queue
    else:
        print("Queue empty")  # Print "Queue empty" if the queue is empty
