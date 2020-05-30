def countDog( s ):
    count = 0
    for word in s.lower().split():
        if word == 'dog':
            count += 1
    return count

print( countDog( 'This dog runs faster than the other dog dude! Dog DoG' ) )

# 4