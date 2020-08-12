def domainGet( email ):
    return email.split( '@' )

print( "+) We have a list: " )
print( domainGet( 'user@domain.com' ) )
print( "\n+) Now we have a string: " )
print( domainGet( 'user@domain.com' )[1] )

'''
+) We have a list:
['user', 'domain.com']

+) Now we have a string:
domain.com
'''