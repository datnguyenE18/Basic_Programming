def caught_speeding( speed, is_birthday ):
    if is_birthday:
        speed = speed - 5
    if speed > 80:
        return 'Big Ticket'
    elif speed > 60:
        return 'Small Ticket'
    else:
        return 'No Ticket'

print( caught_speeding( 81,True ) )
print( caught_speeding( 81,False ) )

'''
Small Ticket
Big Ticket
'''