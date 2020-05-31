# Sử dụng "mysillyobject" và "abc" thay vì "self":

class Person:
  def __init__( mysillyobject, name, age ):
    mysillyobject.ten = name
    mysillyobject.tuoi = age

  def myfunc( abc ):
    print( "Hello my name is " + abc.ten + ", I am" , abc.tuoi, "years old" )

p1 = Person( "Nguyen", 30 )
p1.myfunc()