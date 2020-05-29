car = {
    "Company" : "Ferrari", 
    "Version" : "488 Pista", 
    "Price" : "7.55 tỷ VNĐ"
    }

# Removes the specified item from the dictionary
print( "+) Removes the specified item from the dictionary:" )
car.pop( "Price" )
print( car )

# The value of the removed item is the return value of the pop() method
print( "\n+) The value of the removed item is the return value of the pop() method:" )
x = car.pop( "Company" )
print( x )

# Syntax: dict.pop(keyname, default_value)
print( "\n+) If the specified key do not exist, default_value is returned : " )
y = car.pop( "abc" , "Error!" ) 
print( y )

'''
+) Removes the specified item from the dictionary:
{'Company': 'Ferrari', 'Version': '488 Pista'}

+) The value of the removed item is the return value of the pop() method:
Ferrari

+) If the specified key do not exist, default_value is returned :
Error!
'''