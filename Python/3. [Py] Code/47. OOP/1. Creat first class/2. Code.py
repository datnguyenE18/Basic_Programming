# Include a set_name method
class Employee:
  
  def set_name( self, new_name ):
    self.name = new_name
  
# Create an object emp of class Employee
emp = Employee()

# Use set_name() on emp to set the name of emp to 'Korel Rossi'
emp.set_name( 'Korel Rossi' )

# Print the name of emp
print( emp.name )

# Output: Korel Rossi