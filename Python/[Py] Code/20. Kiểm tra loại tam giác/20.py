a = int( input() )
b = int( input() )
c = int( input() )

if a == b == c: #Pyhon hỗ trợ dạng này, khác với C / C++
    print( "Equilateral triangle" )
elif a == b or b == c or a == c:
    print( "Isosceles triangle" )
else: print( "Scalene triangle" )