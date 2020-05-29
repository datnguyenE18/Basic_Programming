car = {
    "Company" : "Ferrari", 
    "Version" : "488 Pista", 
    "Price" : "7.55 tỷ VNĐ"
    }

# Returns the value of the item with the specified key
print( "+) Returns the value of the item with the specified key:" )
x = car.setdefault( "Price" )
print( x )
print( "=> like Dictionary.get() method:" )
y = car.get( "Price" )
print( y )

# If the key does not exist, insert the key, with the specified value, Default value None
print( "\n+) If the key does not exist, insert the key, with the specified value: " )
z = car.setdefault( "Color" )
print( z )
print( car )
m = car.setdefault( "Power","720 cv (Max Power Ouput)" )
print( m )
print( car )

'''
+) Returns the value of the item with the specified key:
7.55 tỷ VNĐ
=> like Dictionary.get() method:
7.55 tỷ VNĐ

+) If the key does not exist, insert the key, with the specified value:
None
{'Company': 'Ferrari', 'Version': '488 Pista', 'Price': '7.55 tỷ VNĐ', 'Color': None}
720 cv (Max Power Ouput)
{'Company': 'Ferrari', 'Version': '488 Pista', 'Price': '7.55 tỷ VNĐ', 'Color': None, 'Power': '720 cv (Max Power Ouput)'}
'''