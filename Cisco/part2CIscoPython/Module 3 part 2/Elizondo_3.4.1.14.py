# William Elizondo 
# 3.4.1.14 Points on a plane

import math  # Import the math module to access mathematical functions.

class Point:
    # Class constructor with default parameters set to 0.0 for x and y.
    def __init__(self, x=0.0, y=0.0):
        self.__x = x  # Initialize a private variable __x with the value of x.
        self.__y = y  # Initialize a private variable __y with the value of y.

    # Method to get the value of __x. Returns the private variable __x.
    def getx(self):
        return self.__x

    # Method to get the value of __y. Returns the private variable __y.
    def gety(self):
        return self.__y

    # Method to calculate the distance from this point to another point (x, y).
    # Uses the math.hypot() function for calculating the Euclidean distance.
    def distance_from_xy(self, x, y):
        return math.hypot(abs(self.__x - x), abs(self.__y - y))

    # Method to calculate the distance from this point to another point.
    # This method uses the distance_from_xy method by passing the x and y values of the other point.
    def distance_from_point(self, point):
        return self.distance_from_xy(point.getx(), point.gety())

# Creating an instance of Point class at (0, 0)
point1 = Point(0, 0)
# Creating another instance of Point class at (1, 1)
point2 = Point(1, 1)

# Printing the distance between point1 and point2
print(point1.distance_from_point(point2))

# Printing the distance from point2 to the coordinates (2, 0)
print(point2.distance_from_xy(2, 0))
