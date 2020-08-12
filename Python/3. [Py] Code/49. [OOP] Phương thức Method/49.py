class Person:
    def __init__( self, name, age ): # Khởi tạo trạng thái , các tính chất của Person (giống dạng hàm Main (của Class) trong C++)
        self.ten = name # Gồm có thông tin về Tên và -
        self.tuoi = age # -tuổi

    def hello( self ): #Phương thức Chào của đối thượng Person...
        print( "Hello, My name is " + self.ten + ", I am" , self.tuoi , "years old" ) # Sử dụng thông tin ở init() để thực hiện phương thức Chào

P1 = Person( "Nguyen", 30 ) # Tạo người số 1 (P1) với tên Nguyên và tuổi 30
P1.hello() # Thực hiện phương thức chào của người này

# Hello, My name is Nguyen, I am 30 years old