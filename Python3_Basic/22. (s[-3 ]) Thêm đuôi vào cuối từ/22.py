s = str( input() )

def format( s ):
    if len( s ) < 3:
        print( s )
    else:
        if s[-3:] == 'ing':
            print( s + 'ly' )
        else: print( s + 'ing' )
format( s )