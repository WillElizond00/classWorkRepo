# William Elizondo
# 3.2.1.15 LAB: Queue aka FIFO
#
# Define a custom exeception for queue-related errors, inheriting from IndexError
class QueueError(IndexError):
    pass

#Define a Queue class to implement queue functionality 
class Queue:
    def __init__(self):
        # Initialize the queue with the empty list
        self.queue = []

    def put(self, elem):
        # Add an element to the beginning of the queue
        self.queue.insert(0, elem)

    def get(self):
        # Remove and return the last element of the queue if it's not empty
        if len(self.queue) > 0:
            elem = self.queue[-1]
            del self.queue[-1]
            return elem
        else:
            # If the queue is empty raise a custom QueueError
            raise QueueError

# Create an instance of the Queue class
que = Queue()

# Add elements to the queue using the put method
que.put(1)
que.put("dog")
que.put(False)

# Attempt to get and print elements from the queue
try:
    # Try to get and print elements from the queue four times
    for i in range(4):
        print(que.get())
except:
    # Catch and print a message if a Queue Error is raised
    print("Queue error")
