def check( x ):
    if x % 2 == 0:
        return True
    else:
        return False

num = [1, 6, 8, 7, 2, 11, 66, 100]
evenNumber = filter( check, num )

print( list( evenNumber ) )
