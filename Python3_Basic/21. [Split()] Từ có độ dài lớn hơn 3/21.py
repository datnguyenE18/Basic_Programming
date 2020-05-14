str = str( input() )

def check( str ):
    ans = []
    temp = str.split( " " )
    for i in temp:
        if len( i ) > 3:
            ans.append( i )
    print( ans )

check( str )