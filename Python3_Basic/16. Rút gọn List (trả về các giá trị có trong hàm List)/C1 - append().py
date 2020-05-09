def get_unique_values( lst ):
    ls = []
    for i in lst:
        if ls.count( i ) < 1:
            ls.append( i )
    return ls 

n = int( input() )
lst = []
for i in range( n ):
    lst.append( int( input() ) )
print( get_unique_values( lst ) )