# Class cha (Class Cơ sở):
class name:
    def __init__( this, lastname, firstname ):
        this.lname = lastname
        this.fname = firstname

    def printName( this ):
        print( this.lname, this.fname )

ten = name( "Nguyen", "Tran" )
ten.printName()

# Class con kế thừa các đặc tính và phương thức của Class cha:
class person ( name ):
    pass

P1 = person( "Nguyen","Quan" )
P1.printName()

# Class con chứa __init__ mới:
class student ( name ):
    def __init__( this, lastname, firstname ):
        name.__init__( this, lastname, firstname )

name1 = student( "Nguyen","Van" )
name1.printName()