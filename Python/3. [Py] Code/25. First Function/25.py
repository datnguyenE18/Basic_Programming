def pow( a , b ):
    return a ** b

output = pow( 2,3 )
output1 = pow( a = 2, b = 3 )
output2 = pow( b = 2, a = 3 )

print( 'pow( 2,3 ) = {}'.format( output ) )
print( 'pow( a = 2, b = 3 ) = {}'.format( output1 ) )
print( 'pow( b = 2, a = 3 ) = {}'.format( output2 ) )

'''
pow( 2,3 ) = 8
pow( a = 2, b = 3 ) = 8
pow( b = 2, a = 3 ) = 9
'''