a = int( input() )
b = int( input() )

def gcd( a,b ):
    if a == 0:
        return b
    else: return gcd( b % a, a )
print( gcd( a,b ) )