def mix( a,b ):
    return a + ' ' + b

str = map( mix, ( 'Apple', 'Banana','Orange' ), ( 'tree', 'smoothie', 'juice' ) )
print( str )

# Convert the map into a list, for readability:
print( list( str ) )

'''
<map object at 0x00000298C28726C8>
['Apple tree', 'Banana smoothie', 'Orange juice']
'''