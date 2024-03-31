# William Elizondo
# 3.4.1.15 Triangle

import math  # Import the math module to use mathematical functions.

class Point:
    # Constructor of the Point class with default coordinates set to 0.0.
    def __init__(self, x=0.0, y=0.0):
        self.__x = x  # Private attribute __x initialized with the value of x.
        self.__y = y  # Private attribute __y initialized with the value of y.

    # Method to return the private attribute __x.
    def getx(self):
        return self.__x

    # Method to return the private attribute __y.
    def gety(self):
        return self.__y

    # Method to calculate distance from this point to another point specified by (x, y).
    # Uses the Pythagorean theorem to find the distance.
    def distance_from_xy(self, x, y):
        return math.hypot(abs(self.__x - x), abs(self.__y - y))

    # Method to calculate distance from this point to another Point instance.
    # Utilizes the distance_from_xy method for this calculation.
    def distance_from_point(self, point):
        return self.distance_from_xy(point.getx(), point.gety())

class Triangle:
    # Constructor of the Triangle class that takes three Point instances as vertices.
    def __init__(self, vertice1, vertice2, vertice3):
        self.__vertices = [vertice1, vertice2, vertice3]  # Private list of vertices.

    # Method to calculate the perimeter of the triangle.
    # It iterates through the vertices, summing the distances between consecutive vertices.
    def perimeter(self):
        per = 0  # Initial perimeter value.
        for i in range(3):
            # Sum the distance between vertex i and the next vertex in the sequence.
            per += self.__vertices[i].distance_from_point(self.__vertices[(i + 1) % 3])
        return per  # Return the calculated perimeter.

# Create a Triangle instance with vertices at (0, 0), (1, 0), and (0, 1).
triangle = Triangle(Point(0, 0), Point(1, 0), Point(0, 1))

# Print the perimeter of the triangle.
print(triangle.perimeter())

