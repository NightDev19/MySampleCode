class Person():
    # __init__ is known as the constructor
    def __init__(self, name, IDnumber):
        self.name = name
        self.IDnumber = IDnumber

# child class
class Employee(Person):
    def __init__(self, name, IDnumber, salary, post):
        self.salary = salary
        self.post = post

        # invoking the __init__ of the parent class
        Person.__init__(self, name, IDnumber)

    def display(self):
        print(self.name)
        print(self.IDnumber)

    def details(self):
        print(f"My name is {self.name}")
        print(f"IdNumber: {self.IDnumber}")
        print(f"Salary : {self.salary}")
        print(f"Post: {self.post}")


# creation of an object variable or an instance
a = Employee('Sherwin', 1022, 20000, "Junior")

# calling a function of the class Person using
# its instance
a.display()
a.details()
