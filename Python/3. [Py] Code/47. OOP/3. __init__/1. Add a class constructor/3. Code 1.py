class Employee:
    # Create __init__() method
    def __init__(self, name, salary = 0):
        # Create the name and salary attributes
        self.name = name
        self.salary = salary
    
    # From the previous lesson
    def give_raise(self, amount):
        self.salary += amount

    def monthly_salary(self):
        return self.salary/12
        
emp = Employee("Korel Rossi")
print(emp.name)
print(emp.salary)

'''
Output:
Korel Rossi
0
'''