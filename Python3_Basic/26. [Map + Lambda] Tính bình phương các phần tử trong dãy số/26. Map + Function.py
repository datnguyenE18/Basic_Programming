def square( num ):
    return num * num

num = ( 1, 2, 3, 4, 5 )
res = map( square , num )
print( res )

# Convert the map into a list, for readability:
print( list( res ) )

'''
<map object at 0x0000015C155B3E88>
[1, 4, 9, 16, 25]
'''