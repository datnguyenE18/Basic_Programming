class Person: # Một người nào đó có ten và có tuoi
    def __init__( self, name, age ):
        self.ten = name
        self.tuoi = age

P1 = Person( "Nguyen" , 30 ) # Khi này P1 sẽ là một người (Person) có tên Nguyen và 30 tuổi. "John" sẽ được gán cho name, 30 sẽ được gán cho age
                             # Khi đó "biến": self.ten = "John", self.tuoi = 30

# In giá trị các "biến" của người 1 (P1) ra màn hình:
print( P1.ten )
print( P1.tuoi )


'''
Nguyen
30
'''