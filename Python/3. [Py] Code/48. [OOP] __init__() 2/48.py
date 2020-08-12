class Myclass ():
     i = 123
     def __init__( self ):
         self.i = 345

a = Myclass()
print( a.i )
print( Myclass().i )

b = Myclass
print( b.i )
print( Myclass.i )

