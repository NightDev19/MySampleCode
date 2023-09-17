from abc import ABC, abstractmethod

# Define an abstract class
class Shape(ABC):
    @abstractmethod
    def area(self):
        pass
    
    @abstractmethod
    def perimeter(self):
        pass

# Create a subclass that inherits from the abstract class
class Rectangle(Shape):
    def __init__(self, length, width):
        self.length = length
        self.width = width
    
    def area(self):
        return self.length * self.width
    
    def perimeter(self):
        return 2 * (self.length + self.width)

# Create another subclass for Square
class Square(Shape):
    def __init__(self, side):
        self.side = side
    
    def area(self):
        return self.side ** 2
    
    def perimeter(self):
        return 4 * self.side

# Create instances of the Rectangle and Square classes
rectangle = Rectangle(5, 4)
square = Square(4)

# Calling methods on the instances
print("Rectangle Area:", rectangle.area())
print("Rectangle Perimeter:", rectangle.perimeter())

print("Square Area:", square.area())
print("Square Perimeter:", square.perimeter())
